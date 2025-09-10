package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngt implements npl {
    private final qju a;
    private final qkr b;
    private final qin c;
    private final qkp d;
    private final pbn e;
    private final ngr f;
    private qko g;
    private final qkl h;
    private final qkl i;

    public ngt(qin qinVar, ngr ngrVar, pbn pbnVar) {
        this.c = qinVar;
        this.d = new qkp(qinVar);
        this.f = ngrVar;
        this.e = pbnVar;
        hvh hvhVar = new hvh(qinVar, 12);
        this.a = hvhVar.a();
        this.b = qkr.e(hvhVar.a, qkt.c(hvhVar.d), qkt.b(hvhVar.c));
        this.h = g(qinVar, "#version 320 es\nprecision highp float;\nin vec2 texCoord;\nout vec4 outColor;\nvoid main() {\n  outColor = vec4(0,0,0,1);\n}\n");
        this.i = g(qinVar, "#version 320 es\n#extension GL_EXT_YUV_target : require\nprecision highp float;\nuniform float fade;\nuniform sampler2D uImgTex;\nin vec2 texCoord;\nlayout(yuv) out vec4 outColor;\nvoid main() {\n  outColor =     vec4(rgb_2_yuv(texture(uImgTex, texCoord).xyz * fade, itu_601_full_range), 1.0);\n}");
    }

    private final void f() {
        if (this.g == null) {
            rnt.L(true);
            return;
        }
        pbn pbnVar = this.e;
        pbnVar.f("closeTexture");
        qko qkoVar = this.g;
        qkoVar.getClass();
        qkoVar.close();
        this.g = null;
        pbnVar.g();
    }

    private static qkl g(qin qinVar, String str) {
        qkl qklVarD = qkl.d(qinVar, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nout vec2 texCoord;\nvoid main() {\n  texCoord = aTexCoord;\n  gl_Position = vec4(aPosition.xyz, aPosition.w);\n}");
        qkl qklVarB = qkl.b(qinVar, str);
        qjv qjvVar = new qjv(qinVar);
        qjvVar.a(new qml(qklVarD));
        qjvVar.a(new qml(qklVarB));
        return qjvVar.b();
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk a(poj pojVar, poj pojVar2) {
        return jsv.y(this, pojVar, pojVar2);
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk b(pdk pdkVar, peo peoVar, pdk pdkVar2) {
        return jsv.z(this, pdkVar, peoVar, pdkVar2);
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.OVERLAY;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        f();
        this.h.close();
        this.i.close();
        this.d.close();
    }

    @Override // defpackage.npl
    public final qin d() {
        return this.c;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    @Override // defpackage.npl
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.npl
    public final npk s(qjn qjnVar, qim qimVar) {
        ngr ngrVar = this.f;
        ovx ovxVar = ngrVar.a;
        if (!((Boolean) ovxVar.d).booleanValue()) {
            f();
            return npk.SKIPPED;
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        long j = ngrVar.c;
        if (j == 0) {
            if (ngrVar.d == 0) {
                ngrVar.c = millis;
                j = millis;
            } else {
                j = 0;
            }
        }
        a.I(millis >= j);
        ngrVar.d = millis;
        ngrVar.a();
        boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
        if (this.g == null) {
            pbn pbnVar = this.e;
            pbnVar.f("allocateTexture");
            rnt.L(this.g == null);
            this.g = qko.c(this.c, new qhx(((qhx) qjnVar.c()).a));
            pbnVar.g();
        }
        this.e.f("capture effect");
        qko qkoVar = this.g;
        qkoVar.getClass();
        qim qimVarD = qim.d(new qmq(qkoVar));
        try {
            qji qjiVarA = qji.m(this.b, this.a).a(this.h);
            qjiVarA.c("aPosition", 0);
            qjiVarA.c("aTexCoord", 1);
            qjiVarA.a(qimVarD);
            qimVarD.close();
            qji qjiVarA2 = qji.m(this.b, this.a).a(this.i);
            qjiVarA2.c("aPosition", 0);
            qjiVarA2.c("aTexCoord", 1);
            qjiVarA2.f("fade", ((Float) this.f.b.d).floatValue());
            qjiVarA2.e("uImgTex", qkoVar);
            qjiVarA2.a(qimVar);
            this.e.g();
            if (!zBooleanValue) {
                f();
            }
            return npk.APPLIED;
        } catch (Throwable th) {
            try {
                qimVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
