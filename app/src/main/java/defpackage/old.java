package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.location.LocationRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class old implements ogt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ old(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.ogt
    public final void a(Object obj, Object obj2) throws Exception {
        ArrayList arrayList;
        olw olwVar;
        int i = this.c;
        if (i == 0) {
            olf olfVar = (olf) obj;
            lpa lpaVar = olfVar.t;
            WeakReference weakReference = new WeakReference(((ole) this.a).a);
            Object obj3 = this.b;
            GoogleHelp googleHelp = (GoogleHelp) ((Intent) obj3).getParcelableExtra("EXTRA_GOOGLE_HELP");
            int i2 = googleHelp.M;
            if (i2 == 0 || i2 == 1) {
                sab sabVar = olj.a;
                synchronized (sabVar) {
                    arrayList = new ArrayList(sabVar);
                }
                if (!arrayList.isEmpty()) {
                    googleHelp.N = arrayList;
                }
            }
            try {
                olh olhVar = (olh) olfVar.t();
                olc olcVar = new olc((Intent) obj3, weakReference);
                Parcel parcelA = olhVar.a();
                fbj.c(parcelA, googleHelp);
                fbj.c(parcelA, null);
                fbj.d(parcelA, olcVar);
                olhVar.A(2, parcelA);
                return;
            } catch (RemoteException e) {
                Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
                return;
            }
        }
        if (i == 1) {
            ocx ocxVar = (ocx) obj;
            Object obj4 = this.a;
            Object obj5 = this.b;
            try {
                ((oda) ocxVar.t()).e(new ocu((ocv) obj5, (odd) obj4), ((odd) obj4).a);
                return;
            } catch (Exception e2) {
                try {
                    if (ode.c(((ocv) obj5).a.b).b() != null) {
                        odb.b().c(new odc(((odd) obj4).a.a.f, 1003, 1));
                    }
                    throw e2;
                } finally {
                    ocw.a.set(false);
                }
            }
        }
        if (i != 2) {
            if (i == 3) {
                int i3 = onm.a;
                onp onpVar = new onp((pfl) obj2);
                onq onqVar = (onq) ((onr) obj).t();
                Parcel parcelA2 = onqVar.a();
                fbj.d(parcelA2, onpVar);
                parcelA2.writeString((String) this.b);
                parcelA2.writeString((String) this.a);
                parcelA2.writeString(null);
                onqVar.A(11, parcelA2);
                return;
            }
            if (i == 4) {
                int i4 = onm.a;
                onq onqVar2 = (onq) ((onr) obj).t();
                onn onnVar = new onn((ogn) this.b);
                Parcel parcelA3 = onqVar2.a();
                parcelA3.writeString((String) this.a);
                fbj.d(parcelA3, onnVar);
                onqVar2.A(28, parcelA3);
                return;
            }
            int i5 = onm.a;
            onp onpVar2 = new onp((pfl) obj2);
            ((onq) ((onr) obj).t()).e(onpVar2, "CURRENT:" + ((String) this.a) + ":" + ((String) this.b));
            return;
        }
        omo omoVar = (omo) obj;
        Object obj6 = this.a;
        ogn ognVarB = ((omj) obj6).b();
        ogl oglVar = ognVarB.b;
        oglVar.getClass();
        boolean zI = omoVar.I(olt.j);
        aaa aaaVar = omoVar.t;
        ?? r0 = this.b;
        synchronized (aaaVar) {
            olw olwVar2 = (olw) aaaVar.get(oglVar);
            if (olwVar2 == null || zI) {
                olw olwVar3 = new olw((omj) obj6);
                aaaVar.put(oglVar, olwVar3);
                olwVar = olwVar3;
            } else {
                olwVar2.a.c(ognVarB);
                olwVar = olwVar2;
                olwVar2 = null;
            }
            if (zI) {
                omg omgVar = (omg) omoVar.t();
                omp ompVarA = omp.a(olwVar2, olwVar, oglVar.a());
                ogg oggVar = new ogg(null, (pfl) obj2);
                Parcel parcelA4 = omgVar.a();
                fbj.c(parcelA4, ompVarA);
                fbj.c(parcelA4, r0);
                fbj.d(parcelA4, oggVar);
                omgVar.A(88, parcelA4);
            } else {
                ((omg) omoVar.t()).e(new omr(1, new omq((LocationRequest) r0, null, false, false, false, false, Long.MAX_VALUE), olwVar, null, null, new omm((pfl) obj2, olwVar), oglVar.a()));
            }
        }
    }

    public /* synthetic */ old(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ old(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }
}
