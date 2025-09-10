package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afu extends uht implements uiu {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ afs f;
    final /* synthetic */ uiu g;
    final /* synthetic */ Object h;
    final /* synthetic */ byz i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afu(afs afsVar, byz byzVar, uiu uiuVar, Object obj, uhb uhbVar) {
        super(2, uhbVar);
        this.f = afsVar;
        this.i = byzVar;
        this.g = uiuVar;
        this.h = obj;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afu) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        afu afuVar = new afu(this.f, this.i, this.g, this.h, uhbVar);
        afuVar.j = obj;
        return afuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, uol] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        byz byzVar;
        byz byzVar2;
        AtomicReference atomicReference;
        byz byzVar3;
        Object obj2;
        uiu uiuVar;
        Object obj3;
        byz byzVar4;
        Throwable th;
        byz byzVar5;
        uhi uhiVar = uhi.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    rnt.aN(obj);
                    und undVar = (und) this.j;
                    afs afsVar = this.f;
                    uhd uhdVar = undVar.c().get(uol.c);
                    uhdVar.getClass();
                    byzVar = new byz(afsVar, (uol) uhdVar, (byte[]) null);
                    byzVar2 = this.i;
                    do {
                        atomicReference = (AtomicReference) byzVar2.a;
                        byzVar3 = (byz) atomicReference.get();
                        if (byzVar3 != null) {
                            if (((afs) byzVar.b).compareTo((afs) byzVar3.b) < 0) {
                                throw new CancellationException(PJGqOKsIpSdZ.BOiFjkACKcZgZtN);
                            }
                        }
                    } while (!a.v(atomicReference, byzVar3, byzVar));
                    if (byzVar3 != null) {
                        byzVar3.a.s(new aft());
                    }
                    obj2 = byzVar2.b;
                    uiuVar = this.g;
                    Object obj4 = this.h;
                    this.j = byzVar;
                    this.a = obj2;
                    this.b = uiuVar;
                    this.c = obj4;
                    this.d = byzVar2;
                    this.e = 1;
                    if (((uxa) obj2).b(this) != uhiVar) {
                        obj3 = obj4;
                    }
                    return uhiVar;
                }
                if (r1 != 1) {
                    byzVar4 = (byz) this.b;
                    obj2 = this.a;
                    byzVar5 = (byz) this.j;
                    try {
                        rnt.aN(obj);
                        a.w((AtomicReference) byzVar4.a, byzVar5);
                        ((uxa) obj2).d();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        a.w((AtomicReference) byzVar4.a, byzVar5);
                        throw th;
                    }
                }
                Object obj5 = this.d;
                obj3 = this.c;
                uiu uiuVar2 = (uiu) this.b;
                Object obj6 = this.a;
                byz byzVar6 = (byz) this.j;
                rnt.aN(obj);
                byzVar2 = obj5;
                obj2 = obj6;
                uiuVar = uiuVar2;
                byzVar = byzVar6;
                this.j = byzVar;
                this.a = obj2;
                this.b = byzVar2;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objA = uiuVar.a(obj3, this);
                if (objA != uhiVar) {
                    byzVar4 = byzVar2;
                    obj = objA;
                    byzVar5 = byzVar;
                    a.w((AtomicReference) byzVar4.a, byzVar5);
                    ((uxa) obj2).d();
                    return obj;
                }
                return uhiVar;
            } catch (Throwable th3) {
                byzVar4 = byzVar2;
                th = th3;
                byzVar5 = byzVar;
                a.w((AtomicReference) byzVar4.a, byzVar5);
                throw th;
            }
        } catch (Throwable th4) {
            ((uxa) r1).d();
            throw th4;
        }
    }
}
