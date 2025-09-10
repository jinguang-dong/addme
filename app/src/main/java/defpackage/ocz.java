package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ocz extends fbi implements IInterface {
    public ocz() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                c(status);
                return true;
            case 2:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                fbj.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                b(status2);
                return true;
            default:
                return false;
        }
    }
}
