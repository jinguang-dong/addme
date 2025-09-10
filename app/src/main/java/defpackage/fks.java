package defpackage;

import android.os.VibrationEffect;
import android.view.View;
import com.google.ar.core.R;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fks implements jhh, jhe, jhc {
    public static final VibrationEffect a = VibrationEffect.startComposition().addPrimitive(1, 1.0f, 0).addPrimitive(1, 1.0f, 52).compose();
    public sbv b;
    public final mbj d;
    public final syj e;
    public final pfl f;
    private final owf g;
    private final owf h;
    private final owf i;
    private final owf j;
    private final out k;
    private our m;
    private final imi n;
    private final AtomicReference l = new AtomicReference(Optional.empty());
    public Optional c = Optional.empty();

    public fks(owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, imi imiVar, pfl pflVar, syj syjVar, out outVar, mbj mbjVar) {
        this.g = owfVar;
        this.h = owfVar2;
        this.i = owfVar3;
        this.j = owfVar4;
        this.n = imiVar;
        this.f = pflVar;
        this.e = syjVar;
        this.k = outVar;
        this.d = mbjVar;
    }

    public final synchronized void a(View view) {
        this.b = (sbv) DesugarArrays.stream(tfc.values()).collect(ryv.a(new fik(8), new tem(this, view, view.findViewById(R.id.arrow), 1)));
    }

    public final void d(nan nanVar) {
        AtomicReference atomicReference = this.l;
        Optional optionalOfNullable = Optional.ofNullable(nanVar);
        Optional optional = (Optional) atomicReference.getAndSet(optionalOfNullable);
        if (optional.equals(optionalOfNullable)) {
            return;
        }
        imi imiVar = this.n;
        imiVar.getClass();
        optional.ifPresent(new fio(imiVar, 6));
        imiVar.getClass();
        optionalOfNullable.ifPresent(new fio(imiVar, 7));
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.m.close();
    }

    @Override // defpackage.jhe
    public final void eb() {
        our ourVar = new our();
        this.m = ourVar;
        owf owfVar = this.g;
        owf owfVarA = owb.a(owl.a(owfVar, this.h, this.i, this.j));
        fbt fbtVar = new fbt(this, 15);
        out outVar = this.k;
        ourVar.d(owfVarA.dK(fbtVar, outVar));
        this.m.d(owfVar.dK(new fbt(this, 16), outVar));
        this.m.d(new fis(this, 5));
    }
}
