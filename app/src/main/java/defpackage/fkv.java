package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkv implements fko {
    public final qin a;
    public final swb b;
    public final float[] c = new float[16];
    public final float[] d = new float[16];
    public final float[] e = new float[3];
    public boolean f = true;
    public Instant g = Instant.EPOCH;
    public final Interpolator h;
    public final qkl i;
    public final obu j;

    public fkv(qin qinVar, fkw fkwVar, swb swbVar) {
        this.a = qinVar;
        obu obuVar = (obu) fkwVar.a(qinVar);
        this.j = obuVar;
        this.b = swbVar;
        this.i = obuVar.t(R.raw.field_of_view_vert, R.raw.field_of_view_frag);
        final hbp hbpVar = new hbp(new PointF(0.0f, 0.025f), new PointF(100.0f, 0.033f), new PathInterpolator(0.33f, 0.0f, 0.56f, 1.0f));
        final hbp hbpVar2 = new hbp(new PointF(100.0f, 0.033f), new PointF(267.0f, 0.025f), new PathInterpolator(0.44f, 0.0f, 0.66f, 1.0f));
        this.h = new Interpolator() { // from class: fku
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                hbp hbpVar3 = hbpVar;
                return f <= ((PointF) hbpVar3.b).x ? hbpVar3.e(f) : hbpVar2.e(f);
            }
        };
    }

    @Override // defpackage.fko
    public final void a(fon fonVar, tfn tfnVar, final float[] fArr, final qjn qjnVar, final qim qimVar) {
        fik fikVar = new fik(11);
        Optional optional = tfnVar.b;
        final boolean zBooleanValue = ((Boolean) optional.map(fikVar).orElse(false)).booleanValue();
        int iA = fkn.a(((Float) optional.map(new fik(12)).orElse(Float.valueOf(1.0f))).floatValue());
        float[] fArr2 = this.e;
        fArr2[0] = Color.red(iA) / 255.0f;
        fArr2[1] = Color.green(iA) / 255.0f;
        fArr2[2] = Color.blue(iA) / 255.0f;
        tfnVar.c.ifPresent(new Consumer() { // from class: fkt
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void d(Object obj) {
                tfj tfjVar = (tfj) obj;
                float[] fArr3 = tfjVar.a;
                fkv fkvVar = this.a;
                float[] fArr4 = fkvVar.c;
                Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr3, 0);
                float[] fArr5 = fkvVar.d;
                if (!Matrix.invertM(fArr5, 0, fArr4, 0)) {
                    Arrays.fill(fArr5, 0.0f);
                }
                if (!fkvVar.f && zBooleanValue) {
                    fkvVar.g = fkvVar.b.a();
                }
                qim qimVar2 = qimVar;
                qjn qjnVar2 = qjnVar;
                float f = tfjVar.b;
                float f2 = tfjVar.c;
                float fMin = Math.min(f, f2);
                float interpolation = fkvVar.h.getInterpolation(Duration.between(fkvVar.g, fkvVar.b.a()).toMillis()) * fMin;
                qji qjiVarA = qji.n(5, qjw.a(fkvVar.a)).a(fkvVar.i);
                qjiVarA.c("a_ClipSpacePosition", 0);
                qjiVarA.c("a_ViewfinderTextureCoord", 1);
                qjiVarA.d("u_ViewfinderTexture", qjnVar2);
                qjiVarA.h(LmJPKwPBa.drHNxQVRvK, ((qhx) qimVar2.e()).a.b(), ((qhx) qimVar2.e()).a.a());
                qjiVarA.g("u_ClipSpaceToPlaneMatrix", (float[]) fArr5.clone());
                qjiVarA.h("u_FrameSize", f, f2);
                qjiVarA.f("u_FrameRadius", fMin * 0.05f);
                qjiVarA.f("u_FrameThickness", interpolation);
                qjiVarA.f(PJGqOKsIpSdZ.MtImPwUj, 0.3f);
                float[] fArr6 = fkvVar.e;
                qjiVarA.i("u_FrameColor", fArr6[0], fArr6[1], fArr6[2]);
                qjiVarA.a(qimVar2);
            }
        });
        this.f = zBooleanValue;
    }

    @Override // defpackage.fko, defpackage.paq, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
