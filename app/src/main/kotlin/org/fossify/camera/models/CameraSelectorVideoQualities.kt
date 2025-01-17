package org.fossify.camera.models

import androidx.camera.core.CameraSelector

data class CameraSelectorVideoQualities(
    val camSelector: CameraSelector,
    val qualities: List<VideoQuality>,
)
