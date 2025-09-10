package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum oyu {
    VIDEO_BUFFER_DELAY(true),
    AUDIO_BUFFER_DELAY(false),
    VIDEO_TRACK_FAIL_TO_START(true),
    AUDIO_TRACK_FAIL_TO_START(false),
    METADATA_DELAY(false),
    METADATA_NOT_FOUND(false),
    AUDIO_RECORD_ERROR(false),
    MUXER_STOP_ERROR(true),
    MEDIA_CODEC_ERROR_AUDIO(true),
    MEDIA_CODEC_ERROR_VIDEO(true),
    FILE_LOST(false),
    CONSECUTIVE_MISSED_METADATA(false),
    OTHER(true);

    public final boolean n;

    oyu(boolean z) {
        this.n = z;
    }
}
