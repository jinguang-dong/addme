package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum nav {
    FLASH_DISABLED(R.string.thermal_flash_disabled_chip_text, false),
    POOR_VIDEO_QUALITY(R.string.thermal_video_quality_chip_text, false),
    RECORDING_EARLY_STOPPED(R.string.thermal_recording_early_stopped_chip_text, false),
    RECORDING_STOPPED(R.string.thermal_recording_stopped_chip_text, false),
    RECORDING_DISABLED(R.string.thermal_recording_disasbled_chip_text, true);

    public final int f;
    public final boolean g;

    nav(int i, boolean z) {
        this.f = i;
        this.g = z;
    }
}
