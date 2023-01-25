package org.taktik.freehealth.middleware.dto.eagreement

class ArgueAgreementRequest(
    var agreementType: String,
    var decisionReference: String,
    var newPrescription: AgreementPrescriptionType?,
    var anteriorPrescription: AgreementPrescriptionType?,
    var annex: List<AgreementAnnexType>?
)
