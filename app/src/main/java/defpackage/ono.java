package defpackage;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ono extends fbi implements IInterface {
    final /* synthetic */ pfl a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ono(pfl pflVar, int i, byte[] bArr) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        this.b = i;
        this.a = pflVar;
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (this.b != 0) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) fbj.a(parcel, Status.CREATOR);
            Location location = (Location) fbj.a(parcel, Location.CREATOR);
            fbj.b(parcel);
            ojl.aG(status, location, this.a);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) fbj.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        fbj.b(parcel);
        if (!status2.b()) {
            ojl.aG(status2, null, this.a);
            return true;
        }
        try {
            tow towVar = tow.a;
            tra traVar = tra.a;
            tph tphVarQ = tph.q(qyp.a, bArrCreateByteArray, 0, bArrCreateByteArray.length, tow.a);
            tph.D(tphVarQ);
            ojl.aG(status2, (qyp) tphVarQ, this.a);
            return true;
        } catch (tpz e) {
            this.a.c(e);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ono(pfl pflVar, int i) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = pflVar;
    }
}
