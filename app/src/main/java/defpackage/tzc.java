package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tzc implements tpk {
    STATUS_CODE_UNSPECIFIED(0),
    STATUS_CODE_SUCCESS(1),
    STATUS_CODE_ERROR_INITIALIZE_DETECTION_MODEL(2),
    STATUS_CODE_ERROR_INITIALIZE_INPAINTING_MODEL(3),
    STATUS_CODE_ERROR_DETECT_LIGHT_SOURCE(4),
    STATUS_CODE_ERROR_DETECT_DECEPTICON(5),
    STATUS_CODE_ERROR_INPAINT_FLARE(6),
    STATUS_CODE_ERROR_RESULT_LOOKS_BAD(7),
    STATUS_CODE_ERROR_FLARE_DOT_ON_FACE(8),
    STATUS_CODE_ERROR_JNI_HANDLE(9),
    STATUS_CODE_ERROR_JNI_PROTO(10),
    STATUS_CODE_ERROR_JNI_POINTER(11),
    STATUS_CODE_ERROR_GAIN_MAP_INPAINT_DOT(12),
    STATUS_CODE_ERROR_INVALID_LUX(13),
    STATUS_CODE_ERROR_DETECT_CEFTAZIDIME(14),
    STATUS_CODE_ERROR_FLARE_TOO_LARGE(15),
    STATUS_CODE_ERROR_TOO_MANY_FLARES(16),
    r(17),
    STATUS_CODE_ERROR_UNSUPPORTED_CAMERA(18);

    public final int t;

    tzc(int i) {
        this.t = i;
    }

    public static tzc b(int i) {
        switch (i) {
            case 0:
                return STATUS_CODE_UNSPECIFIED;
            case 1:
                return STATUS_CODE_SUCCESS;
            case 2:
                return STATUS_CODE_ERROR_INITIALIZE_DETECTION_MODEL;
            case 3:
                return STATUS_CODE_ERROR_INITIALIZE_INPAINTING_MODEL;
            case 4:
                return STATUS_CODE_ERROR_DETECT_LIGHT_SOURCE;
            case 5:
                return STATUS_CODE_ERROR_DETECT_DECEPTICON;
            case 6:
                return STATUS_CODE_ERROR_INPAINT_FLARE;
            case 7:
                return STATUS_CODE_ERROR_RESULT_LOOKS_BAD;
            case 8:
                return STATUS_CODE_ERROR_FLARE_DOT_ON_FACE;
            case 9:
                return STATUS_CODE_ERROR_JNI_HANDLE;
            case 10:
                return STATUS_CODE_ERROR_JNI_PROTO;
            case 11:
                return STATUS_CODE_ERROR_JNI_POINTER;
            case 12:
                return STATUS_CODE_ERROR_GAIN_MAP_INPAINT_DOT;
            case 13:
                return STATUS_CODE_ERROR_INVALID_LUX;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return STATUS_CODE_ERROR_DETECT_CEFTAZIDIME;
            case 15:
                return STATUS_CODE_ERROR_FLARE_TOO_LARGE;
            case 16:
                return STATUS_CODE_ERROR_TOO_MANY_FLARES;
            case 17:
                return r;
            case 18:
                return STATUS_CODE_ERROR_UNSUPPORTED_CAMERA;
            default:
                return null;
        }
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
