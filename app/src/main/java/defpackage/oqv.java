package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqv extends ofo {
    public oqv(oew oewVar) {
        super(oewVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ ofc a(Status status) {
        return new oqy(status, null);
    }

    @Override // defpackage.ofo
    protected final /* bridge */ /* synthetic */ void b(oej oejVar) {
        osr osrVar = (osr) ((otq) oejVar).t();
        otn otnVar = new otn(this);
        Parcel parcelA = osrVar.a();
        fbj.d(parcelA, otnVar);
        parcelA.writeString("snapshot_from_wear");
        parcelA.writeInt(0);
        osrVar.A(42, parcelA);
    }

    @Override // defpackage.ofo, defpackage.ofp
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.k((ofc) obj);
    }
}
