package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txv extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public txv(int i) {
        String strBv;
        switch (i) {
            case 0:
                strBv = "VR Service present";
                break;
            case 1:
                strBv = "VR Service missing";
                break;
            case 2:
                strBv = "VR Service disabled";
                break;
            case 3:
                strBv = "VR Service updating";
                break;
            case 4:
                strBv = "VR Service obsolete";
                break;
            case 5:
                strBv = "VR Service not connected";
                break;
            case 6:
                strBv = "No permission to do operation";
                break;
            case 7:
                strBv = "This operation is not supported on this device";
                break;
            case 8:
                strBv = "An unknown failure occurred";
                break;
            default:
                strBv = a.bv(i, "Invalid connection result: ");
                break;
        }
        super(strBv);
    }
}
