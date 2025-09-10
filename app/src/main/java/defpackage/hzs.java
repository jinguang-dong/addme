package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.ViewfinderResults;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface hzs {
    public static final nmt a = new nmt(100.0f);

    boolean A(pjr pjrVar, poe poeVar, poj pojVar, poj pojVar2, pjr pjrVar2, poe poeVar2, poj pojVar3);

    BurstSpec B(iby ibyVar, poj pojVar, poe poeVar, boolean z, boolean z2, hxu hxuVar, Optional optional, Optional optional2);

    void C(iby ibyVar, pjr pjrVar, int i, poe poeVar, tbq tbqVar, poj pojVar);

    Bitmap D(pjr pjrVar, poj pojVar, poe poeVar, gga ggaVar, kox koxVar, boolean z, rwc rwcVar, rwc rwcVar2, rwc rwcVar3);

    iby E(pjr pjrVar, ltd ltdVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar);

    iby F(pjr pjrVar, ltd ltdVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, boolean z);

    iby G(pjr pjrVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, boolean z, int i2, rwc rwcVar, iea ieaVar, boolean z2);

    iby H(pjr pjrVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, int i2, boolean z, iea ieaVar);

    @Deprecated
    int a(pjr pjrVar);

    int b(tcy tcyVar);

    int c(poe poeVar, pjr pjrVar);

    iap d(poj pojVar, poe poeVar, boolean z, pas pasVar);

    AeResults e(iap iapVar);

    BurstSpec f(iby ibyVar, poj pojVar, poe poeVar, rwc rwcVar, Optional optional);

    FrameMetadata g(poe poeVar, pjr pjrVar, boolean z);

    PhysicalStabilityParams h(int i);

    PostShutterAfParams i(int i);

    tcy j(poe poeVar, pjr pjrVar);

    ViewfinderResults k(int i);

    void l(iby ibyVar);

    void m(iby ibyVar);

    void n(iby ibyVar, pjr pjrVar, int i, poe poeVar, tbq tbqVar, poj pojVar, poj pojVar2, poj pojVar3, poj pojVar4, rwc rwcVar, poe poeVar2);

    void o(pjr pjrVar, poj pojVar, poe poeVar);

    void p(pjr pjrVar, poe poeVar);

    void q(iby ibyVar);

    void r(iby ibyVar, BurstSpec burstSpec);

    void s(iby ibyVar);

    void t(int i);

    void u(pjr pjrVar);

    void v(int i);

    boolean w(poe poeVar, pjr pjrVar);

    boolean x(iby ibyVar, BurstSpec burstSpec);

    boolean y(iby ibyVar);

    boolean z(poe poeVar, pjr pjrVar);
}
