package org.taktik.freehealth.middleware.dto.eagreement

class CompleteAgreementResponse(
    var hcpNihii: String,
    var patientSsin: String?,
    var patientIo: String?,
    var patientIoMembership: String?,
    var rejectedReason: List<String>?,
    var agreementType: String?,
    var decisionReference: String?,
    var decisionDate: String?,
    var responsibleIo: String?
)
