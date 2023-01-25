package org.taktik.freehealth.middleware.dto.eagreement

class ArgueAgreementResponse(
    var hcpNihii: String,
    var patientSsin: String?,
    var patientIo: String?,
    var patientIoMembership: String?,
    var rejectedReason: List<String>?,
    var agreementType: String?,
    var decisionReference: String?,
    var pathologicalSituationCode: String?,
    var decisionStatus: String?,
    var decisionDate: String?,
    var responsibleIo: String?
)
