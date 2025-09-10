package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpj extends ujq implements uif {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(dyj dyjVar, UUID uuid, int i) {
        super(0);
        this.c = i;
        this.b = dyjVar;
        this.a = uuid;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r10v36, types: [bry, java.lang.Object] */
    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        Object obj;
        bvm bvmVar;
        Object objA;
        int i = 3;
        char[] cArr = null;
        switch (this.c) {
            case 0:
                ((bpk) this.a).c((bij) this.b);
                return ufg.a;
            case 1:
                ((uka) this.a).a = ((bkb) this.b).o();
                return ufg.a;
            case 2:
                bvx bvxVar = (bvx) this.a;
                bvxVar.f.g = 0;
                bdp bdpVarI = bvxVar.p().i();
                Object[] objArr = bdpVarI.a;
                int i2 = bdpVarI.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    bvx bvxVar2 = ((bvm) objArr[i3]).t.p;
                    bvxVar2.getClass();
                    bvxVar2.h = bvxVar2.i;
                    bvxVar2.i = Integer.MAX_VALUE;
                    if (bvxVar2.w == 2) {
                        bvxVar2.w = 3;
                    }
                }
                bvxVar.k(aap.f);
                bvu bvuVar = ((bva) bvxVar.j()).g;
                if (bvuVar != null) {
                    boolean z = bvuVar.k;
                    List listT = bvxVar.p().t();
                    int size = listT.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bvu bvuVarY = ((bvm) listT.get(i4)).o().y();
                        if (bvuVarY != null) {
                            bvuVarY.k = z;
                        }
                    }
                }
                ((bvu) this.b).G().f();
                if (((bva) bvxVar.j()).g != null) {
                    List listT2 = bvxVar.p().t();
                    int size2 = listT2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        bvu bvuVarY2 = ((bvm) listT2.get(i5)).o().y();
                        if (bvuVarY2 != null) {
                            bvuVarY2.k = false;
                        }
                    }
                }
                bdp bdpVarI2 = bvxVar.p().i();
                Object[] objArr2 = bdpVarI2.a;
                int i6 = bdpVarI2.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    bvx bvxVar3 = ((bvm) objArr2[i7]).t.p;
                    bvxVar3.getClass();
                    int i8 = bvxVar3.h;
                    int i9 = bvxVar3.i;
                    if (i8 != i9 && i9 == Integer.MAX_VALUE) {
                        bvxVar3.y(true);
                    }
                }
                bvxVar.k(aap.g);
                return ufg.a;
            case 3:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.b));
            case 4:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.b));
            case 5:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.b));
            case 6:
                bzw bzwVar = (bzw) this.a;
                cbl cblVar = bzwVar.d;
                cbl cblVar2 = bzwVar.e;
                Float f = bzwVar.b;
                Float f2 = bzwVar.c;
                float fFloatValue = (cblVar == null || f == null) ? 0.0f : ((Number) cblVar.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (cblVar2 == null || f2 == null) ? 0.0f : ((Number) cblVar2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    Object obj2 = this.b;
                    byc bycVar = (byc) obj2;
                    int iM = bycVar.m(bzwVar.a);
                    ebn ebnVar = (ebn) bycVar.p().a(bycVar.i);
                    if (ebnVar != null) {
                        try {
                            cpt cptVar = ((byc) obj2).k;
                            if (cptVar != null) {
                                cptVar.j(((byc) obj2).O(ebnVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    Object obj3 = this.b;
                    byc bycVar2 = (byc) obj3;
                    ebn ebnVar2 = (ebn) bycVar2.p().a(bycVar2.j);
                    if (ebnVar2 != null) {
                        try {
                            cpt cptVar2 = ((byc) obj3).l;
                            if (cptVar2 != null) {
                                cptVar2.j(((byc) obj3).O(ebnVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    byc bycVar3 = (byc) this.b;
                    bycVar3.b.invalidate();
                    ebn ebnVar3 = (ebn) bycVar3.p().a(iM);
                    if (ebnVar3 != null && (obj = ebnVar3.a) != null && (bvmVar = ((cbr) obj).b) != null) {
                        if (cblVar != null) {
                            bycVar3.y.f(iM, cblVar);
                        }
                        if (cblVar2 != null) {
                            bycVar3.z.f(iM, cblVar2);
                        }
                        bycVar3.t(bvmVar);
                    }
                }
                if (cblVar != null) {
                    ((bzw) this.a).b = (Float) cblVar.a.a();
                }
                if (cblVar2 != null) {
                    ((bzw) this.a).c = (Float) cblVar2.a.a();
                }
                return ufg.a;
            case 7:
                ?? r0 = this.a;
                if (r0 != 0 && (objA = r0.a()) != null) {
                    return objA;
                }
                ?? r10 = this.b;
                boolean zDm = r10.dm();
                bry bryVar = r10;
                if (true != zDm) {
                    bryVar = null;
                }
                if (bryVar != null) {
                    return bko.r(chp.G(bryVar.h()));
                }
                return null;
            case 8:
                Object obj4 = this.b;
                eap eapVar = ((dzy) this.a).a;
                synchronized (eapVar.b) {
                    LinkedHashSet linkedHashSet = eapVar.c;
                    if (linkedHashSet.remove(obj4) && linkedHashSet.isEmpty()) {
                        eapVar.e();
                    }
                }
                return ufg.a;
            default:
                Object obj5 = this.b;
                dyj dyjVar = (dyj) obj5;
                WorkDatabase workDatabase = dyjVar.d;
                workDatabase.getClass();
                workDatabase.o(new eao(obj5, this.a, i, cArr));
                dxn.a(dyjVar.c, dyjVar.d, dyjVar.e);
                return ufg.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
