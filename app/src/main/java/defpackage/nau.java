package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum nau {
    NONE(-1),
    MIC_BROKEN(R.string.vid_chip_br_mic),
    AUDIO_MISSING_DURING_RECORDING(R.string.vid_chip_no_aud),
    VIDEO_MISSING_DURING_RECORDING(R.string.vid_chip_part_err),
    SNAPSHOT_FAILURE(R.string.vid_chip_4),
    PARTIAL_VIDEO_MISSING_AFTER_RECORDING(R.string.vid_chip_part_err_done),
    NO_VIDEO_AFTER_RECORDING(R.string.vid_chip_err),
    CAPTURE_SESSION_ERROR(R.string.vid_chip_session_err),
    RECORDING_TOO_SHORT(R.string.vid_chip_recording_too_short),
    ONE_MIN_REMAINING(R.string.vid_chip_one_min_remaining),
    FIVE_SECS_REMAINING(R.string.vid_chip_five_secs_remaining);

    public final int l;

    nau(int i) {
        this.l = i;
    }
}
