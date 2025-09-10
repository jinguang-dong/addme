package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu extends uht implements uiu {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ acs e;
    final /* synthetic */ uiq f;
    final /* synthetic */ byz g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acu(acs acsVar, byz byzVar, uiq uiqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.e = acsVar;
        this.g = byzVar;
        this.f = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acu) c((und) obj, (uhb) obj2)).b(ufg.a);
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
        uiq uiqVar;
        byz byzVar4;
        Throwable th;
        byz byzVar5;
        uhi uhiVar = uhi.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    rnt.aN(obj);
                    und undVar = (und) this.h;
                    acs acsVar = this.e;
                    uhd uhdVar = undVar.c().get(uol.c);
                    uhdVar.getClass();
                    byzVar = new byz(acsVar, (uol) uhdVar, (byte[]) null);
                    byzVar2 = this.g;
                    do {
                        atomicReference = (AtomicReference) byzVar2.a;
                        byzVar3 = (byz) atomicReference.get();
                        if (byzVar3 != null) {
                            if (((acs) byzVar.b).compareTo((acs) byzVar3.b) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!a.v(atomicReference, byzVar3, byzVar));
                    if (byzVar3 != null) {
                        byzVar3.a.s(new act());
                    }
                    obj2 = byzVar2.b;
                    uiq uiqVar2 = this.f;
                    this.h = byzVar;
                    this.a = obj2;
                    this.b = uiqVar2;
                    this.c = byzVar2;
                    this.d = 1;
                    if (((uxa) obj2).b(this) != uhiVar) {
                        uiqVar = uiqVar2;
                    }
                    return uhiVar;
                }
                if (r1 != 1) {
                    byzVar4 = (byz) this.b;
                    obj2 = this.a;
                    byzVar5 = (byz) this.h;
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
                Object obj3 = this.c;
                uiqVar = (uiq) this.b;
                Object obj4 = this.a;
                byz byzVar6 = (byz) this.h;
                rnt.aN(obj);
                byzVar2 = obj3;
                obj2 = obj4;
                byzVar = byzVar6;
                this.h = byzVar;
                this.a = obj2;
                this.b = byzVar2;
                this.c = null;
                this.d = 2;
                Object objA = uiqVar.a(this);
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

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        acu acuVar = new acu(this.e, this.g, this.f, uhbVar);
        acuVar.h = obj;
        return acuVar;
    }
}
