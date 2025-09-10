package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksy implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ksy(fgn fgnVar, owf owfVar, owf owfVar2, AtomicReference atomicReference, int i) {
        this.e = i;
        this.a = fgnVar;
        this.d = owfVar;
        this.b = owfVar2;
        this.c = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        int i = this.e;
        if (i == 0) {
            krj krjVar = (krj) obj;
            our ourVar = krjVar.L;
            Object obj2 = this.a;
            sgv sgvVar = ktb.a;
            ourVar.d(owb.a(owl.a(obj2, ((FocusIndicatorView) this.b.a()).j)).dK(new fcd(this.c, krjVar, this.d, 7, (byte[]) null), sxo.a));
            return;
        }
        if (i == 1) {
            ((AtomicReference) this.c).set(qpt.cm((CaptureRequest.Key) obj, owl.h(owl.a(this.d, this.b), new pgd(true != ((fgn) this.a).b ? 0 : 2, 1))));
            return;
        }
        lcz lczVar = (lcz) obj;
        uem uemVar = (uem) ((Map) this.c.a()).get(lczVar);
        if (uemVar != null) {
            Object obj3 = this.a;
            pjr pjrVar = (pjr) ((peq) uemVar.a()).b.c();
            if (!pjrVar.equals(obj3) || pjrVar.equals(this.d)) {
                return;
            }
            ?? r8 = this.b;
            ((peq) uemVar.a()).b.c();
            r8.put(lczVar, (peq) uemVar.a());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.e;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ ksy(kcv kcvVar, tzj tzjVar, Predicate predicate, krs krsVar, int i) {
        this.e = i;
        this.a = kcvVar;
        this.b = tzjVar;
        this.c = predicate;
        this.d = krsVar;
    }

    public /* synthetic */ ksy(uem uemVar, pjr pjrVar, pjr pjrVar2, Map map, int i) {
        this.e = i;
        this.c = uemVar;
        this.a = pjrVar;
        this.d = pjrVar2;
        this.b = map;
    }
}
