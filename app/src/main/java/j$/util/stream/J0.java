package j$.util.stream;

/* loaded from: classes3.dex */
public class J0 extends K0 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(T t, Object obj, int i) {
        super(t);
        this.c = i;
        this.d = obj;
    }

    @Override // j$.util.stream.K0
    public final void a() {
        switch (this.c) {
            case 0:
                ((S) this.a).f(this.b, this.d);
                break;
            default:
                this.a.m((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new J0(this, ((S) this.a).a(i), i2);
            default:
                return new J0(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(J0 j0, T t, int i) {
        super(j0, t, i);
        this.c = 1;
        this.d = (Object[]) j0.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(J0 j0, S s, int i) {
        super(j0, s, i);
        this.c = 0;
        this.d = j0.d;
    }
}
