package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import j$.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kwn implements kvy {
    private static final sgv c = sgv.g(mPfBwqXsnpXI.pCedNeHIN);
    public int a;
    public final lqo b;
    private final out d;
    private final boolean e;
    private final Optional f;
    private final Optional g;
    private int h;
    private final Object i = new Object();
    private final ggg j;

    public kwn(lqo lqoVar, out outVar, ggg gggVar, hbj hbjVar, Optional optional, Optional optional2) {
        this.b = lqoVar;
        this.d = outVar;
        this.j = gggVar;
        this.e = hbjVar.o(gzo.am);
        this.f = optional;
        this.g = optional2;
    }

    private final syu d(final Optional optional) {
        final szh szhVar = new szh();
        this.d.execute(new Runnable() { // from class: kwk
            @Override // java.lang.Runnable
            public final void run() {
                kwn kwnVar = this.a;
                lqo lqoVar = kwnVar.b;
                if (lqoVar.c.dL() == nkw.NIGHT_SIGHT) {
                    nll nllVar = lqoVar.m;
                    rnt.x(nllVar);
                    nllVar.d(lqoVar.k);
                } else {
                    Optional optional2 = optional;
                    if (optional2.isPresent()) {
                        nll nllVar2 = lqoVar.m;
                        rnt.x(nllVar2);
                        nllVar2.c(((Float) optional2.get()).floatValue());
                    } else {
                        nll nllVar3 = lqoVar.m;
                        rnt.x(nllVar3);
                        nllVar3.e();
                    }
                }
                szh szhVar2 = szhVar;
                lqs lqsVar = lqoVar.f;
                rnt.x(lqsVar);
                lqsVar.setVisibility(0);
                ske.W(lqs.g(), new kwl(kwnVar, szhVar2), sxo.a);
            }
        });
        return szhVar;
    }

    private final boolean e() {
        Optional optional = this.f;
        return optional.isPresent() && ((lxa) optional.get()).c();
    }

    private final void f() {
        this.g.isPresent();
    }

    private final void g(pfz pfzVar, Optional optional, obv obvVar) {
        if (e()) {
            ((lxa) this.f.get()).e(pfzVar, optional, obvVar);
        } else {
            f();
        }
    }

    @Override // defpackage.kvy
    public final void a() {
        synchronized (this.i) {
            int i = this.h;
            if (i > 0) {
                int i2 = i - 1;
                this.h = i2;
                if (i2 == 0) {
                    this.d.execute(new kxw(this, 1));
                }
            }
        }
    }

    @Override // defpackage.kvy
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [sgt, shi] */
    @Override // defpackage.kvy
    public final kvx c(pfz pfzVar) {
        Optional optionalEmpty;
        int i = 0;
        kwm kwmVar = new kwm(0);
        try {
            synchronized (this.i) {
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 == 1) {
                    pdi pdiVarA = pfzVar.a();
                    ((phd) pdiVarA).c = 5;
                    int i3 = 2;
                    ((phd) pdiVarA).e = Integer.valueOf(true != this.e ? 0 : 2);
                    syu syuVarB = pfzVar.b(((phd) pdiVarA).c());
                    if (e()) {
                        optionalEmpty = this.f.map(new kwj(i3));
                    } else {
                        f();
                        optionalEmpty = Optional.empty();
                    }
                    syu syuVarD = d(optionalEmpty);
                    if (((swn) syuVarB).s() != null) {
                        obv obvVar = (obv) ((swn) syuVarD).s();
                        g(pfzVar, optionalEmpty, obvVar);
                        if (optionalEmpty.isPresent()) {
                            optionalEmpty.get();
                            long j = obvVar.a;
                        }
                        ggg gggVar = this.j;
                        kqt kqtVar = new kqt(obvVar.a);
                        kwf kwfVar = new kwf(kqtVar);
                        ((kuj) gggVar.a).o(kwfVar);
                        try {
                            szh szhVar = kqtVar.a;
                            szhVar.c(new kee(gggVar, kwfVar, 10, null), sxo.a);
                            ((Boolean) szhVar.s()).booleanValue();
                            if (e()) {
                                Optional optional = this.f;
                                if (optional.isPresent() && ((lxa) optional.get()).d() && e()) {
                                    Optional optionalEmpty2 = !e() ? Optional.empty() : optional.map(new kwj(i));
                                    obv obvVar2 = (obv) ((swn) d(optionalEmpty2)).s();
                                    g(pfzVar, optionalEmpty2, obvVar2);
                                    optionalEmpty2.get();
                                    long j2 = obvVar2.a;
                                }
                            }
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            return kwmVar;
        } catch (CancellationException | ExecutionException | pco e2) {
            ((sgt) ((sgt) c.b().i(e2)).M((char) 3541)).s("Couldn't turn on selfie flash");
            return kwmVar;
        }
    }
}
