package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iub {
    public final int a;
    public final int b;

    public iub(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iub)) {
            return false;
        }
        iub iubVar = (iub) obj;
        return this.a == iubVar.a && this.b == iubVar.b;
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        return (this.a * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LapPerfettoTriggerConfig(triggeringDropCount=");
        sb.append(this.a);
        sb.append(", triggerType=");
        switch (this.b) {
            case 6:
                str = "SESSION_JANK";
                break;
            case 7:
                str = "SHOT_DRIFT";
                break;
            case 8:
                str = "SHOT_FAILURE";
                break;
            case 9:
                str = uCzt.PcdUhaIxPCTQV;
                break;
            case 10:
                str = "SLOW_HAL_INSTALL";
                break;
            case 11:
                str = "SLOW_LAUNCH";
                break;
            case 12:
                str = "SLOW_SHOT_THUMBNAIL";
                break;
            case 13:
                str = "SLOW_SINGLE_SHOT_HDR_PLUS_CAPTURE";
                break;
            default:
                str = "STARTUP_VIEWFINDER_JANK";
                break;
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
