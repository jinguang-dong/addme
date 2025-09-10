package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sci extends ryp implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient sbv map;
    final transient int size;

    public sci(sbv sbvVar, int i) {
        this.map = sbvVar;
        this.size = i;
    }

    public final sbe a() {
        return (sbe) super.p();
    }

    @Override // defpackage.sea
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.sea
    public final int e() {
        return this.size;
    }

    @Override // defpackage.ryg
    public final /* synthetic */ Collection f() {
        return new scg(this);
    }

    @Override // defpackage.ryg
    public final /* bridge */ /* synthetic */ Iterator g() {
        throw null;
    }

    @Override // defpackage.ryg
    public final Map j() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ryg
    public final Set k() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.sea
    @Deprecated
    public final void l() {
        throw null;
    }

    @Override // defpackage.ryg, defpackage.sea
    public final /* bridge */ /* synthetic */ Collection p() {
        throw null;
    }

    @Override // defpackage.ryg, defpackage.sea
    public /* synthetic */ Map q() {
        return this.map;
    }

    @Override // defpackage.ryg, defpackage.sea
    public final /* bridge */ /* synthetic */ Set r() {
        throw null;
    }

    @Override // defpackage.ryg, defpackage.sea
    @Deprecated
    public final boolean v(Object obj, Object obj2) {
        throw null;
    }
}
