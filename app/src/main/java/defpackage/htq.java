package defpackage;

import android.view.View;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class htq implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ htq(azr azrVar, gox goxVar, bqc bqcVar, nhy nhyVar, View view, azr azrVar2, int i) {
        this.g = i;
        this.b = azrVar;
        this.d = goxVar;
        this.c = bqcVar;
        this.a = nhyVar;
        this.f = view;
        this.e = azrVar2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bst, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.g;
        int i2 = 0;
        if (i == 0) {
            ShotMetadata shotMetadata = (ShotMetadata) obj;
            shotMetadata.getClass();
            ShotMetadata shotMetadata2 = (ShotMetadata) this.a;
            shotMetadata2.d().x(shotMetadata.d().b());
            huy huyVar = (huy) this.e;
            pld[] pldVarArr = huyVar.c;
            InterleavedImageU16 interleavedImageU16 = huyVar.e;
            Object obj2 = this.d;
            Object obj3 = this.f;
            Object obj4 = this.c;
            Object obj5 = this.b;
            synchronized (obj5) {
                if (((hui) obj5).l.contains(Integer.valueOf(((iby) obj4).a()))) {
                    hui huiVar = (hui) obj5;
                    ukc.C(huiVar.k, null, 0, new hug(huiVar, (iby) obj4, (ggg) obj3, shotMetadata2, shotMetadata, (float[]) obj2, interleavedImageU16, null), 3);
                } else {
                    ((sgt) hui.a.c().M(1597)).w("Attempted to add linear not tracked by this session: sessionId=%d, shot_id = %d", ((hui) obj5).f, ((iby) obj4).a());
                }
            }
            return ufg.a;
        }
        if (i != 1) {
            bkf bkfVar = (bkf) obj;
            jsv.N(this.e, false);
            ?? r0 = this.b;
            if (r0 != 0) {
                r0.b(false);
            }
            Object obj6 = this.f;
            Object obj7 = this.a;
            Object obj8 = this.c;
            gox goxVar = (gox) this.d;
            goxVar.s(goxVar.q().b((goxVar.n() + (((int) (((bql) obj8).g >> 32)) / 2)) - Float.intBitsToFloat((int) (bkfVar.a >> 32))));
            jsv.U(niz.d, (nhy) obj7, (View) obj6, goxVar);
            return ufg.a;
        }
        btd btdVar = (btd) obj;
        int i3 = 0;
        while (true) {
            bte[] bteVarArr = (bte[]) this.d;
            if (i3 >= bteVarArr.length) {
                return ufg.a;
            }
            Object obj9 = this.f;
            Object obj10 = this.a;
            Object obj11 = this.c;
            ?? r6 = this.b;
            ?? r7 = this.e;
            bte bteVar = bteVarArr[i3];
            bteVar.getClass();
            aku.d(btdVar, bteVar, (bsq) r7.get(i2), r6.m(), ((ujy) obj11).a, ((ujy) obj10).a, ((akw) obj9).a);
            i3++;
            i2++;
        }
    }

    public /* synthetic */ htq(ShotMetadata shotMetadata, hui huiVar, iby ibyVar, ggg gggVar, float[] fArr, huy huyVar, int i) {
        this.g = i;
        this.a = shotMetadata;
        this.b = huiVar;
        this.c = ibyVar;
        this.f = gggVar;
        this.d = fArr;
        this.e = huyVar;
    }

    public /* synthetic */ htq(bte[] bteVarArr, List list, bst bstVar, ujy ujyVar, ujy ujyVar2, akw akwVar, int i) {
        this.g = i;
        this.d = bteVarArr;
        this.e = list;
        this.b = bstVar;
        this.c = ujyVar;
        this.a = ujyVar2;
        this.f = akwVar;
    }
}
