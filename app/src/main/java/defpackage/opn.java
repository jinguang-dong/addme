package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class opn extends fbi implements IInterface {
    public opn() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, opm opmVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) fbj.a(parcel, Status.CREATOR);
                opm opmVar = (opm) fbj.a(parcel, opm.CREATOR);
                fbj.b(parcel);
                b(status, opmVar);
                return true;
            case 3:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                c(status2);
                return true;
            case 5:
                Status status3 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                fbj.e(parcel);
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                fbj.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
