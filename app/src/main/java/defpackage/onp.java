package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onp extends fbi implements IInterface {
    private final pfl a;

    public onp(pfl pflVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = pflVar;
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status, this.a);
                return true;
            case 2:
                Status status2 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status2, this.a);
                return true;
            case 3:
                Status status3 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status3, this.a);
                return true;
            case 4:
                Status status4 = (Status) fbj.a(parcel, Status.CREATOR);
                omx omxVar = (omx) fbj.a(parcel, omx.CREATOR);
                fbj.b(parcel);
                ojl.aG(status4, omxVar, this.a);
                return true;
            case 5:
                Status status5 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status5, this.a);
                return true;
            case 6:
                Status status6 = (Status) fbj.a(parcel, Status.CREATOR);
                onb onbVar = (onb) fbj.a(parcel, onb.CREATOR);
                fbj.b(parcel);
                ojl.aG(status6, onbVar, this.a);
                return true;
            case 7:
                Status status7 = (Status) fbj.a(parcel, Status.CREATOR);
                omy omyVar = (omy) fbj.a(parcel, omy.CREATOR);
                fbj.b(parcel);
                ojl.aG(status7, omyVar, this.a);
                return true;
            case 8:
                Status status8 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status8, this.a);
                return true;
            case 9:
                Status status9 = (Status) fbj.a(parcel, Status.CREATOR);
                ond ondVar = (ond) fbj.a(parcel, ond.CREATOR);
                fbj.b(parcel);
                ojl.aG(status9, ondVar, this.a);
                return true;
            case 10:
                Status status10 = (Status) fbj.a(parcel, Status.CREATOR);
                omx omxVar2 = (omx) fbj.a(parcel, omx.CREATOR);
                fbj.b(parcel);
                ojl.aG(status10, omxVar2, this.a);
                return true;
            case 11:
                Status status11 = (Status) fbj.a(parcel, Status.CREATOR);
                parcel.readLong();
                fbj.b(parcel);
                ojl.aG(status11, null, this.a);
                return true;
            case 12:
                Status status12 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status12, this.a);
                return true;
            case 13:
                Status status13 = (Status) fbj.a(parcel, Status.CREATOR);
                onf onfVar = (onf) fbj.a(parcel, onf.CREATOR);
                fbj.b(parcel);
                ojl.aG(status13, onfVar, this.a);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Status status14 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status14, this.a);
                return true;
            case 15:
                Status status15 = (Status) fbj.a(parcel, Status.CREATOR);
                fbj.b(parcel);
                ojl.aF(status15, this.a);
                return true;
            case 16:
                Status status16 = (Status) fbj.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                fbj.b(parcel);
                ojl.aG(status16, Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }

    public onp() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }
}
