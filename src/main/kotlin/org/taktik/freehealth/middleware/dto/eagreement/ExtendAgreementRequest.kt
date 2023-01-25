package org.taktik.freehealth.middleware.dto.eagreement

class ExtendAgreementRequest(
    var agreementType: String,
    var decisionReference: String,
    var agreementStartDate: Long,
    var pathologicalSituationCode: String,
    var newPrescription: AgreementPrescriptionType,
    var additionnalNote: String?,
    var annex: List<AgreementAnnexType>?
)
