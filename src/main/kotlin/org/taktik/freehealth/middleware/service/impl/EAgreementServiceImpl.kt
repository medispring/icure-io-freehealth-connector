package org.taktik.freehealth.middleware.service.impl

import org.taktik.connector.technical.exception.TechnicalConnectorException
import org.taktik.freehealth.middleware.dto.eagreement.AgreementAnnexType
import org.taktik.freehealth.middleware.dto.eagreement.AgreementPrescriptionType
import org.taktik.freehealth.middleware.dto.eagreement.ArgueAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.AskAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CancelAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CompleteAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ConsultListOfAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ExtendAgreementResponse
import org.taktik.freehealth.middleware.exception.MissingTokenException
import org.taktik.freehealth.middleware.service.EAgreementService
import org.taktik.freehealth.middleware.service.STSService
import java.time.Instant
import java.util.*

class EAgreementServiceImpl(private val stsService: STSService): EAgreementService {
    override fun askAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        agreementStartDate: Instant,
        pathologyStartDate: Instant,
        pathologicalSituationCode: String,
        additionnalNote: String?,
        newPrescription: AgreementPrescriptionType,
        anteriorPrescription: AgreementPrescriptionType?,
        annex: List<AgreementAnnexType>?
    ): AskAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")

        /*return try {

        }catch (e: TechnicalConnectorException) {
            throw IllegalArgumentException(e)
        }*/
        TODO("Not yet implemented")
    }

    override fun extendAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        decisionReference: String,
        agreementStartDate: Instant,
        pathologicalSituationCode: String,
        newPrescription: AgreementPrescriptionType,
        additionnalNote: String?,
        annex: List<AgreementAnnexType>?
    ): ExtendAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")
        TODO("Not yet implemented")
    }

    override fun argueAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        decisionReference: String,
        newPrescription: AgreementPrescriptionType?,
        anteriorPrescription: AgreementPrescriptionType?,
        annex: List<AgreementAnnexType>?
    ): ArgueAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")
        TODO("Not yet implemented")
    }

    override fun completeAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        decisionReference: String,
        newPrescription: AgreementPrescriptionType
    ): CompleteAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")
        TODO("Not yet implemented")
    }

    override fun cancelAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        decisionReference: String
    ): CancelAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")
        TODO("Not yet implemented")
    }

    override fun consultListOfAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String
    ): ConsultListOfAgreementResponse {
        val samlToken = stsService.getSAMLToken(tokenId, keystoreId, passPhrase)
            ?: throw MissingTokenException("Cannot obtain token for EAgreement operations")
        TODO("Not yet implemented")
    }

}
