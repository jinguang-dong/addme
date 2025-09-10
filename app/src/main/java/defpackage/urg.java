package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urg extends utw {
    private final uqz d;

    public urg(uqz uqzVar, uhf uhfVar, int i, int i2) {
        super(uhfVar, i, i2);
        this.d = uqzVar;
        int i3 = uly.b;
    }

    @Override // defpackage.utw
    protected final Object b(uqx uqxVar, uhb uhbVar) throws Throwable {
        Object objK = ukc.K(new uuq(uqxVar), this.d, false, uhbVar);
        return objK == uhi.a ? objK : ufg.a;
    }

    @Override // defpackage.utw
    protected final utw c(uhf uhfVar, int i, int i2) {
        return new urg(this.d, uhfVar, i, i2);
    }

    @Override // defpackage.utw
    protected final String d() {
        uqz uqzVar = this.d;
        Objects.toString(uqzVar);
        return "channel=".concat(uqzVar.toString());
    }

    @Override // defpackage.utw
    public final uqz e(und undVar) {
        return this.b == -3 ? this.d : super.e(undVar);
    }

    @Override // defpackage.utw
    public final urk f() {
        return new urg(this.d);
    }

    @Override // defpackage.utw, defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) throws Throwable {
        if (this.b == -3) {
            Object objK = ukc.K(urlVar, this.d, false, uhbVar);
            if (objK == uhi.a) {
                return objK;
            }
        } else {
            Object objH = utw.h(this, urlVar, uhbVar);
            if (objH == uhi.a) {
                return objH;
            }
        }
        return ufg.a;
    }

    public /* synthetic */ urg(uqz uqzVar) {
        this(uqzVar, uhg.a, -3, 1);
    }
}
