package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edn extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dwi d;
    final /* synthetic */ ebx e;
    final /* synthetic */ ejs f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edn(dwi dwiVar, ejs ejsVar, ebx ebxVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = dwiVar;
        this.f = ejsVar;
        this.e = ebxVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edn) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, uol] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        syu syuVar;
        Object obj2;
        uol uolVar;
        uhi uhiVar = uhi.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj3 = this.b;
                    obj2 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        rnt.aN(obj);
                        uolVar = obj3;
                        obj2 = obj2;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        syuVar = obj2;
                        String str = eds.a;
                        dwi dwiVar = this.d;
                        dwj.b();
                        Objects.toString(dwiVar.getClass());
                        int i = atomicInteger.get();
                        if (syuVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    rnt.aN(obj);
                    und undVar = (und) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    dwi dwiVar2 = this.d;
                    ejs ejsVar = this.f;
                    ebx ebxVar = this.e;
                    syu syuVarA = dwiVar2.a();
                    uol uolVarC = ukc.C(undVar, null, 0, new dnl(ejsVar, ebxVar, atomicInteger2, syuVarA, (uhb) null, 4), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = syuVarA;
                        this.b = uolVarC;
                        this.c = 1;
                        try {
                            if (syuVarA.isDone()) {
                                int i2 = ciu.c;
                                obj = a.H(syuVarA);
                            } else {
                                uml umlVar = new uml(ske.aE(this), 1);
                                umlVar.x();
                                syuVarA.c(new dxr(syuVarA, umlVar, 1), cja.a);
                                umlVar.d(new cjb(syuVarA, 0));
                                obj = umlVar.i();
                                uhi uhiVar2 = uhi.a;
                            }
                            if (obj == uhiVar) {
                                return uhiVar;
                            }
                            atomicInteger = atomicInteger2;
                            obj2 = syuVarA;
                            uolVar = uolVarC;
                        } catch (ExecutionException e2) {
                            throw cgh.j(e2);
                        }
                    } catch (CancellationException e3) {
                        cancellationException = e3;
                        atomicInteger = atomicInteger2;
                        syuVar = syuVarA;
                        String str2 = eds.a;
                        dwi dwiVar3 = this.d;
                        dwj.b();
                        Objects.toString(dwiVar3.getClass());
                        int i3 = atomicInteger.get();
                        if (syuVar.isCancelled() || i3 == -256) {
                            throw cancellationException;
                        }
                        throw new edl(atomicInteger.get());
                    }
                }
                cpn cpnVar = (cpn) obj;
                uolVar.s(null);
                return cpnVar;
            } catch (Throwable th) {
                r1.s(null);
                throw th;
            }
        } catch (Throwable th2) {
            String str3 = eds.a;
            dwi dwiVar4 = this.d;
            dwj.b();
            Objects.toString(dwiVar4.getClass());
            throw th2;
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        edn ednVar = new edn(this.d, this.f, this.e, uhbVar);
        ednVar.g = obj;
        return ednVar;
    }
}
