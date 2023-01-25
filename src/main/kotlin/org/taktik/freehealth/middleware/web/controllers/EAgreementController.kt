package org.taktik.freehealth.middleware.web.controllers

import ma.glasnost.orika.MapperFacade
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.taktik.freehealth.middleware.dto.eagreement.ArgueAgreementRequest
import org.taktik.freehealth.middleware.dto.eagreement.ArgueAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.AskAgreementRequest
import org.taktik.freehealth.middleware.dto.eagreement.AskAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CancelAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CompleteAgreementRequest
import org.taktik.freehealth.middleware.dto.eagreement.CompleteAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ConsultListOfAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ExtendAgreementRequest
import org.taktik.freehealth.middleware.dto.eagreement.ExtendAgreementResponse
import org.taktik.freehealth.middleware.service.EAgreementService
import java.time.Instant
import java.util.*

@RestController
@RequestMapping("/eagreement")
class EAgreementController(val eAgreementService: EAgreementService, val mapper: MapperFacade){

    @PostMapping("/ask", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun askAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestParam hcpNihii: String,
        @RequestParam(required = false) patientSsin: String?,
        @RequestParam(required = false) patientIo: String?,
        @RequestParam(required = false) patientIoMembership: String?,
        @RequestBody askAgreementRequest: AskAgreementRequest
    ): AskAgreementResponse {
        return eAgreementService.askAgreement(
            keystoreId = keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = askAgreementRequest.agreementType,
            agreementStartDate = askAgreementRequest.agreementStartDate.let { Instant.ofEpochMilli(it) },
            pathologyStartDate = askAgreementRequest.pathologyStartDate.let { Instant.ofEpochMilli(it) },
            pathologicalSituationCode = askAgreementRequest.pathologicalSituationCode,
            additionnalNote = askAgreementRequest.additionnalNote,
            newPrescription = askAgreementRequest.newPrescription,
            anteriorPrescription = askAgreementRequest.anteriorPrescription,
            annex = askAgreementRequest.annex
        )
    }

    @PostMapping("/extend", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun extendAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestParam hcpNihii: String,
        @RequestParam(required = false) patientSsin: String?,
        @RequestParam(required = false) patientIo: String?,
        @RequestParam(required = false) patientIoMembership: String?,
        @RequestBody(required = false) extendAgreementRequest: ExtendAgreementRequest
    ): ExtendAgreementResponse {
        return eAgreementService.extendAgreement(
            keystoreId = keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = extendAgreementRequest.agreementType,
            decisionReference = extendAgreementRequest.decisionReference,
            agreementStartDate = extendAgreementRequest.agreementStartDate.let { Instant.ofEpochMilli(it) },
            pathologicalSituationCode = extendAgreementRequest.pathologicalSituationCode,
            newPrescription = extendAgreementRequest.newPrescription,
            additionnalNote = extendAgreementRequest.additionnalNote,
            annex = extendAgreementRequest.annex
        )
    }

    @PostMapping("/argue", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun argueAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestHeader hcpNihii: String,
        @RequestHeader(required = false) patientSsin: String?,
        @RequestHeader(required = false) patientIo: String?,
        @RequestHeader(required = false) patientIoMembership: String?,
        @RequestBody argueAgreementRequest: ArgueAgreementRequest
    ): ArgueAgreementResponse {
        return eAgreementService.argueAgreement(
            keystoreId= keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = argueAgreementRequest.agreementType,
            decisionReference = argueAgreementRequest.decisionReference,
            newPrescription = argueAgreementRequest.newPrescription,
            anteriorPrescription = argueAgreementRequest.anteriorPrescription,
            annex = argueAgreementRequest.annex
        )
    }

    @PostMapping("/complete", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun completeAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestHeader hcpNihii: String,
        @RequestHeader(required = false) patientSsin: String?,
        @RequestHeader(required = false) patientIo: String?,
        @RequestHeader(required = false) patientIoMembership: String?,
        @RequestBody completeAgreementRequest: CompleteAgreementRequest
    ): CompleteAgreementResponse {
        return eAgreementService.completeAgreement(
            keystoreId= keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = completeAgreementRequest.agreementType,
            decisionReference = completeAgreementRequest.decisionReference,
            newPrescription = completeAgreementRequest.newPrescription
        )
    }

    @GetMapping("/cancel", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun cancelAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestHeader hcpNihii: String,
        @RequestHeader(required = false) patientSsin: String?,
        @RequestHeader(required = false) patientIo: String?,
        @RequestHeader(required = false) patientIoMembership: String?,
        @RequestHeader agreementType: String,
        @RequestHeader decisionReference: String
    ): CancelAgreementResponse{
        return eAgreementService.cancelAgreement(
            keystoreId= keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = agreementType,
            decisionReference = decisionReference
        )
    }

    @GetMapping("/consult", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun consultListOfAgreement(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        @RequestHeader hcpNihii: String,
        @RequestHeader(required = false) patientSsin: String?,
        @RequestHeader(required = false) patientIo: String?,
        @RequestHeader(required = false) patientIoMembership: String?,
        @RequestHeader agreementType: String
    ): ConsultListOfAgreementResponse{
        return eAgreementService.consultListOfAgreement(
            keystoreId= keystoreId,
            tokenId = tokenId,
            passPhrase = passPhrase,
            hcpNihii = hcpNihii,
            patientSsin = patientSsin,
            io = patientIo,
            ioMembership = patientIoMembership,
            agreementType = agreementType
        )
    }

}
