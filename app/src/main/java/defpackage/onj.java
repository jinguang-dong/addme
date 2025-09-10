package defpackage;

import android.location.Location;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class onj implements ogt {
    private final /* synthetic */ int a;

    public /* synthetic */ onj(int i) {
        this.a = i;
    }

    @Override // defpackage.ogt
    public final void a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            int i2 = onm.a;
            onq onqVar = (onq) ((onr) obj).t();
            ono onoVar = new ono((pfl) obj2, 0);
            Parcel parcelA = onqVar.a();
            fbj.d(parcelA, onoVar);
            onqVar.A(27, parcelA);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                int i3 = onm.a;
                return;
            }
            opd opdVar = new opd((pfl) obj2);
            opo opoVar = (opo) ((opt) obj).t();
            Parcel parcelA2 = opoVar.a();
            fbj.d(parcelA2, opdVar);
            opoVar.A(2, parcelA2);
            return;
        }
        omo omoVar = (omo) obj;
        oly olyVar = new oly(Long.MAX_VALUE, 0, false, null);
        if (omoVar.I(olt.j)) {
            omg omgVar = (omg) omoVar.t();
            omp ompVar = new omp(4, null, new ono((pfl) obj2, 1, null), null, null);
            Parcel parcelA3 = omgVar.a();
            fbj.c(parcelA3, olyVar);
            fbj.c(parcelA3, ompVar);
            omgVar.A(90, parcelA3);
            return;
        }
        if (!omoVar.I(olt.f)) {
            omg omgVar2 = (omg) omoVar.t();
            Parcel parcelZ = omgVar2.z(7, omgVar2.a());
            Location location = (Location) fbj.a(parcelZ, Location.CREATOR);
            parcelZ.recycle();
            ((pfl) obj2).d(location);
            return;
        }
        omg omgVar3 = (omg) omoVar.t();
        ono onoVar2 = new ono((pfl) obj2, 1, null);
        Parcel parcelA4 = omgVar3.a();
        fbj.c(parcelA4, olyVar);
        fbj.d(parcelA4, onoVar2);
        omgVar3.A(82, parcelA4);
    }
}
