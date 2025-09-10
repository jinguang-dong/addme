package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pod implements poe {
    private final poe a;

    public pod(poe poeVar) {
        this.a = poeVar;
    }

    @Override // defpackage.pnx
    public Object a(CaptureResult.Key key) {
        throw null;
    }

    @Override // defpackage.pnx
    public String b() {
        throw null;
    }

    @Override // defpackage.pnx
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.pnx
    public final pnw e() {
        return this.a.e();
    }

    @Override // defpackage.pnx
    public final int ew() {
        return this.a.ew();
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        return this.a.ex(cls);
    }

    @Override // defpackage.pnx
    public final List f() {
        return this.a.f();
    }

    @Override // defpackage.poe
    public final Map g() {
        return this.a.g();
    }

    @Override // defpackage.poe
    public final Map h() {
        return this.a.h();
    }

    @Override // defpackage.pns
    public final qaq j() {
        return this.a.j();
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("delegate", this.a);
        return rwbVarW.toString();
    }
}
