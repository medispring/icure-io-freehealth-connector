package org.taktik.freehealth.middleware.dto.eagreement

import java.time.Instant

class AskAgreementRequest(
    var agreementType: String,
    var agreementStartDate: Long,
    var pathologyStartDate: Long,
    var pathologicalSituationCode: String,
    var additionnalNote: String?,
    var newPrescription: AgreementPrescriptionType,
    var anteriorPrescription: AgreementPrescriptionType,
    var annex: List<AgreementAnnexType>
)
