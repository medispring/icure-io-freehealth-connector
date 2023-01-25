package org.taktik.freehealth.middleware.dto.eagreement

class CompleteAgreementRequest(
    var agreementType: String,
    var decisionReference: String,
    var newPrescription: AgreementPrescriptionType
)
