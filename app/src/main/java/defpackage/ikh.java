package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.ar.core.R;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikh implements ijq {
    private ikg d;
    private ikg e;
    private boolean f;
    private float g;
    private float h;
    private final float[] i;
    private final float[] j;
    private boolean k;
    private final iiw l;
    private final ima m;
    private final ima n;
    private final Map o;
    private final float[] p;
    private ime q;
    private imc r;
    private final ijr s;
    private final ija t;
    private final ijj u;
    private final Context v;
    private final ikd[] a = new ikd[4];
    private final kwp w = new kwp();
    private final ikf b = new ikf();
    private final float[] c = {0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f};

    public ikh(ijr ijrVar, ija ijaVar, ijj ijjVar, Context context) {
        ikg ikgVar = ikg.IDLE;
        this.d = ikgVar;
        this.e = ikgVar;
        this.f = false;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.j = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        this.k = false;
        EnumMap enumMap = new EnumMap(iji.class);
        this.o = enumMap;
        this.p = new float[16];
        this.s = ijrVar;
        this.t = ijaVar;
        this.u = ijjVar;
        this.v = context;
        enumMap.put((EnumMap) iji.WHITE, (iji) Float.valueOf(25.0f));
        enumMap.put((EnumMap) iji.RED, (iji) Float.valueOf(35.0f));
        this.l = new iiw();
        this.m = new ima(ikgVar);
        this.n = new ima(ike.WHITE);
        this.q = new ime();
        this.r = new imc();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(defpackage.ikg r22, float r23, float r24, float r25) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikh.d(ikg, float, float, float):void");
    }

    @Override // defpackage.ijq
    public final void a() {
        ime imeVar = this.q;
        if (imeVar != null) {
            imeVar.a();
            this.q = null;
        }
        imc imcVar = this.r;
        if (imcVar != null) {
            imcVar.a();
            this.r = null;
        }
    }

    @Override // defpackage.ijq
    public final void b() {
        ikg ikgVar;
        boolean z = this.k;
        ijr ijrVar = this.s;
        boolean z2 = ijrVar.g < 0.007f;
        this.k = z2;
        if (z2 && !z) {
            this.l.a();
            this.m.a();
            this.n.a();
        }
        if (!this.k && z) {
            ima imaVar = this.m;
            imaVar.a();
            imaVar.c = ikg.IDLE;
            this.n.a();
        }
        float f = 1.0f - ijrVar.g;
        float f2 = (f * 0.5f) + 0.5f;
        this.g = f2;
        float f3 = ijrVar.l;
        this.g = f2 * f3;
        this.h = ((f * 0.7f) + 0.3f) * f3;
        this.f = false;
        ijj ijjVar = this.u;
        Map map = this.o;
        ijjVar.h(map);
        Float f4 = (Float) map.get(iji.WHITE);
        float fFloatValue = f4 != null ? f4.floatValue() : 25.0f;
        boolean z3 = !ijrVar.m ? ijjVar.f() > (-fFloatValue) : ijjVar.f() < fFloatValue;
        Float f5 = (Float) map.get(iji.RED);
        float fFloatValue2 = f5 != null ? f5.floatValue() : 35.0f;
        if (!z3 || Math.abs(ijjVar.f()) < fFloatValue2) {
            double d = ijjVar.p;
            if (d <= -10.0d) {
                ikgVar = ikg.SHOW_ROLL_RIGHT;
            } else if (d >= 10.0d) {
                ikgVar = ikg.SHOW_ROLL_LEFT;
            } else {
                float f6 = (float) ijjVar.f;
                if (f6 >= 10.0f) {
                    ikgVar = ikg.SHOW_ARROW_UP;
                } else if (f6 <= -10.0f) {
                    ikgVar = ikg.SHOW_ARROW_DOWN;
                } else {
                    float f7 = (float) ijjVar.g;
                    if (f7 >= 10.0f) {
                        ikgVar = ikg.SHOW_ARROW_BACKTRACK;
                    } else {
                        this.d = z3 ? ikg.SHOW_WARNING_VELOCITY : d <= -3.5d ? ikg.SHOW_ROLL_RIGHT : d >= 3.5d ? ikg.SHOW_ROLL_LEFT : f6 >= 2.5f ? ikg.SHOW_ARROW_UP : f6 <= -2.5f ? ikg.SHOW_ARROW_DOWN : f7 >= 2.0f ? ikg.SHOW_ARROW_BACKTRACK : ikg.IDLE;
                    }
                }
            }
            this.d = ikgVar;
            this.f = true;
        } else {
            this.d = ikg.SHOW_WARNING_VELOCITY;
            this.f = true;
        }
        if (this.k) {
            this.f = false;
        }
        if (!ijjVar.j() || ijrVar.n) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            float f8 = ijrVar.b;
            float f9 = ijrVar.c;
            float f10 = (ijrVar.h ? ijrVar.d : ijrVar.e) / 2.0f;
            if (this.q == null || !this.t.b()) {
                return;
            }
            ima imaVar2 = this.n;
            imaVar2.c = this.f ? ike.RED : ike.WHITE;
            imaVar2.b();
            float[] fArr = ijrVar.i;
            float[] fArr2 = this.j;
            float[] fArr3 = this.i;
            float f11 = imaVar2.a;
            float[] fArr4 = ijy.a;
            float f12 = fArr3[0];
            float f13 = fArr2[0];
            fArr[0] = ((f12 - f13) * f11) + f13;
            float f14 = fArr3[1];
            float f15 = fArr2[1];
            fArr[1] = ((f14 - f15) * f11) + f15;
            float f16 = fArr3[2];
            float f17 = fArr2[2];
            fArr[2] = ((f16 - f17) * f11) + f17;
            ima imaVar3 = this.m;
            imaVar3.c = this.k ? ikg.SHOW_START_ARROW_LEFT : this.d;
            imaVar3.b();
            if (this.k) {
                this.l.b();
                d(ikg.SHOW_START_ARROW_LEFT, f8, f9, f10);
                d(ikg.SHOW_START_ARROW_RIGHT, f8, f9, f10);
            } else {
                Object obj = imaVar3.b;
                if (obj != ikg.IDLE) {
                    if (this.e != obj) {
                        this.l.a();
                    }
                    this.l.b();
                    d((ikg) imaVar3.b, f8, f9, f10);
                }
            }
            this.e = (ikg) imaVar3.b;
        }
    }

    @Override // defpackage.ijq
    public final void c(int i, int i2) {
        ime imeVar = this.q;
        if (imeVar != null) {
            imeVar.c(i, i2);
        }
        imc imcVar = this.r;
        if (imcVar != null) {
            imcVar.c(i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Context context = this.v;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_arrow_alt, options);
        ikd[] ikdVarArr = this.a;
        ikd ikdVar = new ikd();
        ikdVarArr[2] = ikdVar;
        ikdVar.a = new Texture(bitmapDecodeResource);
        ikdVarArr[2].c = bitmapDecodeResource.getHeight() / bitmapDecodeResource.getWidth();
        ikdVarArr[2].b = 0.12f;
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_tilt_up, options);
        ikd ikdVar2 = new ikd();
        ikdVarArr[1] = ikdVar2;
        ikdVar2.a = new Texture(bitmapDecodeResource2);
        ikdVarArr[1].c = bitmapDecodeResource2.getHeight() / bitmapDecodeResource2.getWidth();
        ikdVarArr[1].b = 0.075f;
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_tilt_down, options);
        ikd ikdVar3 = new ikd();
        ikdVarArr[0] = ikdVar3;
        ikdVar3.a = new Texture(bitmapDecodeResource3);
        ikdVarArr[0].c = bitmapDecodeResource3.getHeight() / bitmapDecodeResource3.getWidth();
        ikdVarArr[0].b = 0.075f;
    }
}
