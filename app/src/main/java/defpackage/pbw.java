package defpackage;

import android.hardware.camera2.CameraAccessException;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum pbw {
    CAMERA_OPEN_TIMEOUT(-12),
    CAMERAS_NOT_ENUMERATED(-11),
    CAMERA_SECURITY_EXCEPTION(-10),
    CAMERA_ID_NOT_VALID(-9),
    CAMERA_ACCESS_CAMERA_ERROR(-8),
    CAMERA_ACCESS_CAMERA_DISCONNECTED(-7),
    CAMERA_ACCESS_CAMERA_DISABLED(-6),
    CAMERA_ACCESS_MAX_CAMERAS_IN_USE(-5),
    CAMERA_ACCESS_CAMERA_IN_USE(-4),
    CAMERA_NO_WAKELOCK_ERROR_CODE(-3),
    CAMERA_DISCONNECTED_ERROR_CODE(-2),
    CAMERA_CLOSED_ERROR_CODE(-1),
    CAMERA_ERROR_CODE_UNKNOWN(0),
    CAMERA_DEVICE_ERROR_CAMERA_IN_USE(1),
    CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE(2),
    CAMERA_DEVICE_ERROR_CAMERA_DISABLED(3),
    CAMERA_DEVICE_ERROR_CAMERA_DEVICE(4),
    CAMERA_DEVICE_ERROR_CAMERA_SERVICE(5),
    CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT(6);

    private static final sbv u;
    public final int t;

    static {
        pbw pbwVar = CAMERA_ACCESS_CAMERA_ERROR;
        pbw pbwVar2 = CAMERA_ACCESS_CAMERA_DISCONNECTED;
        pbw pbwVar3 = CAMERA_ACCESS_CAMERA_DISABLED;
        pbw pbwVar4 = CAMERA_ACCESS_MAX_CAMERAS_IN_USE;
        pbw pbwVar5 = CAMERA_ACCESS_CAMERA_IN_USE;
        pbw pbwVar6 = CAMERA_DEVICE_ERROR_CAMERA_IN_USE;
        pbw pbwVar7 = CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE;
        pbw pbwVar8 = CAMERA_DEVICE_ERROR_CAMERA_DISABLED;
        pbw pbwVar9 = CAMERA_DEVICE_ERROR_CAMERA_DEVICE;
        pbw pbwVar10 = CAMERA_DEVICE_ERROR_CAMERA_SERVICE;
        sbr sbrVar = new sbr();
        sbrVar.f(4, pbwVar5);
        sbrVar.f(5, pbwVar4);
        sbrVar.f(1, pbwVar3);
        sbrVar.f(2, pbwVar2);
        sbrVar.f(3, pbwVar);
        u = sbrVar.b();
        sbr sbrVar2 = new sbr();
        sbrVar2.f(1, pbwVar6);
        sbrVar2.f(2, pbwVar7);
        sbrVar2.f(3, pbwVar8);
        sbrVar2.f(4, pbwVar9);
        sbrVar2.f(5, pbwVar10);
        sbrVar2.b();
    }

    pbw(int i) {
        this.t = i;
    }

    public static pbw a(int i) {
        pbw pbwVar = (pbw) u.get(Integer.valueOf(i));
        if (pbwVar != null) {
            return pbwVar;
        }
        throw new IllegalStateException("Unknown Camera Access error code");
    }

    public static pbw b(pjs pjsVar) {
        Throwable th = pjsVar.b;
        return th instanceof CameraAccessException ? a(((CameraAccessException) th).getReason()) : !(th instanceof IllegalArgumentException) ? CAMERA_ERROR_CODE_UNKNOWN : CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT;
    }

    public static boolean d(pbw pbwVar) {
        return pbwVar.equals(CAMERAS_NOT_ENUMERATED) || pbwVar.equals(CAMERA_ACCESS_CAMERA_ERROR) || pbwVar.equals(CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT);
    }

    public static boolean e(pbw pbwVar) {
        return pbwVar.equals(CAMERA_DEVICE_ERROR_CAMERA_DEVICE) || pbwVar.equals(CAMERA_DEVICE_ERROR_CAMERA_SERVICE);
    }

    public final String c() {
        switch (ordinal()) {
            case 0:
                return "Camera open timed out.";
            case 1:
                return "Unable to connect to any camera";
            case 2:
                return "App does not have permission to access camera at the moment";
            case 3:
                return "Camera id no longer valid";
            case 4:
                return PNlJufQ.PFJwlYsFWd;
            case 5:
                return "CameraAccessException - Camera disconnected";
            case 6:
                return "CameraAccessException - The camera is disabled due to a device policy, and cannot be opened.";
            case 7:
                return "CameraAccessException - Maximum cameras in use.";
            case 8:
                return "CameraAccessException - The camera device is in use already.";
            case 9:
                return "App is not holding a camera wakelock";
            case 10:
                return "Camera was disconnected";
            case 11:
                return "App closed the camera device";
            case 12:
            default:
                return "Unknown failure reason (" + this.t + ")";
            case 13:
                return "Camera is in use (1)";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "Maximum cameras in use (2)";
            case 15:
                return "Camera is disabled (3)";
            case 16:
                return "Camera encountered a fatal error (4)";
            case 17:
                return "Camera service encountered a fatal error (5)";
            case 18:
                return "Unable to retrieve camera characteristics for unknown device";
        }
    }
}
