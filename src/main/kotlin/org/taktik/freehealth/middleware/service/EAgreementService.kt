package org.taktik.freehealth.middleware.service


import org.taktik.freehealth.middleware.dto.eagreement.AgreementAnnexType
import org.taktik.freehealth.middleware.dto.eagreement.AgreementPrescriptionType
import org.taktik.freehealth.middleware.dto.eagreement.ArgueAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.AskAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CancelAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.CompleteAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ConsultListOfAgreementResponse
import org.taktik.freehealth.middleware.dto.eagreement.ExtendAgreementResponse
import java.time.Instant
import java.util.*

interface EAgreementService {
    fun askAgreement(
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
    ) : AskAgreementResponse

    fun extendAgreement(
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
    ): ExtendAgreementResponse

    fun argueAgreement(
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
    ): ArgueAgreementResponse

    fun completeAgreement(
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
    ): CompleteAgreementResponse

    fun cancelAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String,
        decisionReference: String
    ): CancelAgreementResponse

    fun consultListOfAgreement(
        keystoreId: UUID,
        tokenId: UUID,
        passPhrase: String,
        hcpNihii: String,
        patientSsin: String?,
        io: String?,
        ioMembership: String?,
        agreementType: String
    ): ConsultListOfAgreementResponse
}
