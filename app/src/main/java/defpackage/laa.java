package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum laa {
    NOT_STARTED,
    NO_ERROR,
    INVALID_BURST_SIZE,
    INVALID_RESOURCES,
    e,
    INVALID_RESULTS,
    INVALID_LATEST_VIEWFINDER_FRAME,
    INVALID_SHOT,
    INTERRUPTED_RESULTS,
    END_PAYLOAD_ERROR,
    END_SHOT_CAPTURE_ERROR,
    UNKNOWN_ERROR,
    INVALID_IMAGE,
    FRAME_ABORTED,
    INVALID_FRAME_METADATA;

    public final hht a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return new hhu(null);
        }
        if (iOrdinal == 2) {
            return new hgz("No payload was requested.");
        }
        switch (iOrdinal) {
            case 4:
                return new hhl("Required metering metadata not found.");
            case 5:
                return new hhp(null);
            case 6:
                return new hhm(null);
            case 7:
                return new hhh("Invalid or null shot returned.");
            case 8:
                return new hho(null);
            case 9:
                return new hha("Error ending the payload");
            case 10:
                return new hhb("Error ending the HDR+ shot");
            case 11:
                return new hht("Something went wrong.");
            case 12:
                return new hht("Missing image");
            case 13:
                return new hht("Frame aborted");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new hht("Missing Frame metadata");
            default:
                return null;
        }
    }

    public final void b() throws hht, pco {
        if (equals(INVALID_RESOURCES)) {
            throw new pco("Required resource not found.");
        }
        hht hhtVarA = a();
        if (hhtVarA != null) {
            throw hhtVarA;
        }
    }
}
