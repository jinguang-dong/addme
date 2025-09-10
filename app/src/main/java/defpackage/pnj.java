package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnj extends OrientationEventListener {
    final /* synthetic */ pnk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnj(pnk pnkVar, Context context) {
        super(context);
        this.a = pnkVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(final int i) {
        if (i < 0) {
            return;
        }
        pnk pnkVar = this.a;
        AtomicReference atomicReference = pnkVar.g;
        pao paoVar = (pao) atomicReference.get();
        pao paoVar2 = (pao) DesugarAtomicReference.updateAndGet(atomicReference, new UnaryOperator() { // from class: pni
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo30andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = i;
                pao paoVar3 = (pao) obj;
                a.I(i2 < 360);
                int iAbs = Math.abs(i2 - paoVar3.e);
                return Math.min(iAbs, 360 - iAbs) >= 50 ? pao.b((((i2 + 45) / 90) * 90) % 360) : paoVar3;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        synchronized (pnkVar.c) {
            Iterator it = pnkVar.b.iterator();
            while (it.hasNext()) {
                ((pnh) it.next()).a(i);
            }
            if (paoVar2 == paoVar) {
                return;
            }
            Iterator it2 = pnkVar.a.iterator();
            while (it2.hasNext()) {
                pnkVar.e.execute(new pev((png) it2.next(), paoVar2, 3, null));
            }
        }
    }
}
