package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ojb implements ogt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ojb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.ogt
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            oja ojaVar = (oja) ((oje) obj).t();
            Parcel parcelA = ojaVar.a();
            fbj.c(parcelA, this.a);
            ojaVar.B(1, parcelA);
            ((pfl) obj2).d(null);
            return;
        }
        if (i == 1) {
            AtomicBoolean atomicBoolean = ocw.a;
            ocs ocsVar = new ocs((pfl) obj2);
            oda odaVar = (oda) ((ocx) obj).t();
            Parcel parcelA2 = odaVar.a();
            fbj.d(parcelA2, ocsVar);
            fbj.c(parcelA2, this.a);
            odaVar.B(8, parcelA2);
            return;
        }
        if (i == 2) {
            int i2 = onm.a;
            ((onq) ((onr) obj).t()).e(new onp((pfl) obj2), (String) this.a);
            return;
        }
        if (i == 3) {
            int i3 = onm.a;
            onp onpVar = new onp((pfl) obj2);
            onq onqVar = (onq) ((onr) obj).t();
            byte[] bArrH = ((tnr) this.a).h();
            Parcel parcelA3 = onqVar.a();
            fbj.d(parcelA3, onpVar);
            parcelA3.writeByteArray(bArrH);
            onqVar.A(31, parcelA3);
            return;
        }
        if (i == 4) {
            oet oetVar = (oet) this.a;
            ((opt) obj).I(((opj) oetVar.d).b, null, new opf(oetVar, (pfl) obj2));
            return;
        }
        otq otqVar = (otq) obj;
        otl otlVar = new otl((pfl) obj2, 1);
        ?? r2 = otqVar.t.a;
        Object obj3 = this.a;
        synchronized (r2) {
            otr otrVar = (otr) r2.remove(obj3);
            if (otrVar == null) {
                otlVar.d(new Status(4002));
                return;
            }
            otrVar.m();
            osr osrVar = (osr) otqVar.t();
            osu osuVar = new osu(r2, obj3, otlVar);
            otf otfVar = new otf(otrVar);
            Parcel parcelA4 = osrVar.a();
            fbj.d(parcelA4, osuVar);
            fbj.c(parcelA4, otfVar);
            osrVar.A(17, parcelA4);
        }
    }
}
