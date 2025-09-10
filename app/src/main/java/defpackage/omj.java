package defpackage;

import android.os.Parcel;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omj implements ogt {
    public ogn a;
    public boolean b = true;
    final /* synthetic */ omk c;

    public omj(omk omkVar, ogn ognVar) {
        this.c = omkVar;
        this.a = ognVar;
    }

    public final synchronized ogn b() {
        return this.a;
    }

    public final synchronized void c(ogn ognVar) {
        ogn ognVar2 = this.a;
        if (ognVar2 != ognVar) {
            ognVar2.a();
            this.a = ognVar;
        }
    }

    @Override // defpackage.ogt
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ogl oglVar;
        boolean z;
        String str = oUZhwRhE.HMAgDCJED;
        omo omoVar = (omo) obj;
        synchronized (this) {
            oglVar = this.a.b;
            z = this.b;
            this.a.a();
        }
        if (oglVar == null) {
            ((pfl) obj2).d(false);
            return;
        }
        aaa aaaVar = omoVar.t;
        synchronized (aaaVar) {
            olw olwVar = (olw) aaaVar.remove(oglVar);
            if (olwVar == null) {
                ((pfl) obj2).d(Boolean.FALSE);
                return;
            }
            olwVar.a.b().a();
            if (!z) {
                ((pfl) obj2).d(Boolean.TRUE);
            } else if (omoVar.I(olt.j)) {
                omg omgVar = (omg) omoVar.t();
                omp ompVarA = omp.a(null, olwVar, str + System.identityHashCode(olwVar));
                ogg oggVar = new ogg(Boolean.TRUE, (pfl) obj2);
                Parcel parcelA = omgVar.a();
                fbj.c(parcelA, ompVarA);
                fbj.d(parcelA, oggVar);
                omgVar.A(89, parcelA);
            } else {
                ((omg) omoVar.t()).e(new omr(2, null, olwVar, null, null, new oml(Boolean.TRUE, (pfl) obj2), null));
            }
        }
    }
}
