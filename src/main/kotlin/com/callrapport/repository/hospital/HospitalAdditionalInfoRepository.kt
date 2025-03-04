package com.callrapport.repository.hospital

import com.callrapport.model.hospital.HospitalAdditionalInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HospitalAdditionalInfoRepository : JpaRepository<HospitalAdditionalInfo, String> {
}
