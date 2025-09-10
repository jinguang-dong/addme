package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class onw extends fbi implements IInterface {
    public onw() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                fbj.b(parcel);
                break;
            case 4:
                fbj.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                fbj.b(parcel);
                break;
            case 7:
                fbj.b(parcel);
                break;
            case 8:
                oob oobVar = (oob) fbj.a(parcel, oob.CREATOR);
                fbj.b(parcel);
                c(oobVar);
                break;
            case 9:
                fbj.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(oob oobVar) {
    }
}
