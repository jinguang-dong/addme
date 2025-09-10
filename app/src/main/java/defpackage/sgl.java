package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sgl extends sek implements sfo {
    private static final long serialVersionUID = 0;
    private transient sgl d;

    public sgl(sfo sfoVar) {
        super(sfoVar);
    }

    @Override // defpackage.sek, defpackage.sad, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.sek, defpackage.sah, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sek
    public final /* bridge */ /* synthetic */ Set c() {
        return ujp.aj(this.a.f());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo, defpackage.sfn
    public final Comparator comparator() {
        return this.a.comparator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sec j() {
        return this.a.j();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sec k() {
        return this.a.k();
    }

    @Override // defpackage.sfo
    public final sec l() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sfo
    public final sec m() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sfo n() {
        sgl sglVar = this.d;
        if (sglVar != null) {
            return sglVar;
        }
        sgl sglVar2 = new sgl(this.a.n());
        sglVar2.d = this;
        this.d = sglVar2;
        return sglVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sek, defpackage.sah
    /* renamed from: o */
    public final /* synthetic */ sed b() {
        return this.a;
    }

    @Override // defpackage.sek, defpackage.sah, defpackage.sed
    /* renamed from: p */
    public final NavigableSet f() {
        return (NavigableSet) super.f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sfo q(Object obj, int i, Object obj2, int i2) {
        return new sgl(this.a.q(obj, i, obj2, i2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sfo r(Object obj, int i) {
        return new sgl(this.a.r(obj, i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sed, sfo] */
    @Override // defpackage.sfo
    public final sfo s(Object obj, int i) {
        return new sgl(this.a.s(obj, i));
    }
}
