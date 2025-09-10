package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy implements acn {
    public final float a;
    public final float b;
    public final Object c;

    public acy() {
        this(null, 7);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiq] */
    @Override // defpackage.aby
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aed a(byz byzVar) {
        Object obj = this.c;
        return new aed(this.a, this.b, obj == null ? null : (ace) byzVar.a.a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acy)) {
            return false;
        }
        acy acyVar = (acy) obj;
        return acyVar.a == this.a && acyVar.b == this.b && a.ao(acyVar.c, this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public acy(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ acy(Object obj, int i) {
        this(1 != (i & 1) ? 0.0f : 1.0f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }
}
