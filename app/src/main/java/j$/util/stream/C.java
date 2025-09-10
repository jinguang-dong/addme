package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class C extends E {
    public final /* synthetic */ F c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f, Predicate predicate) {
        super(f);
        this.c = f;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        F f = this.c;
        if (zTest == f.a) {
            this.a = true;
            this.b = f.b;
        }
    }
}
