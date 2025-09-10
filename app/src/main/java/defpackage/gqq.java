package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import com.google.android.apps.camera.cameravisionkit.NewQrGleamingView;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqq implements pau {
    public boolean a;
    public NewQrGleamingView b;
    private final out c;
    private final cxb f;
    private int e = 1;
    private UUID d = UUID.randomUUID();

    public gqq(out outVar, cxb cxbVar) {
        this.c = outVar;
        this.f = cxbVar;
    }

    private final synchronized void c() {
        this.d = UUID.randomUUID();
        this.e = 1;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th;
        int i;
        UUID uuid;
        Optional optional = (Optional) obj;
        if (this.a) {
            if (optional.isEmpty()) {
                c();
                this.c.execute(new gpk(this, 5));
                return;
            }
            RectF rectF = (RectF) optional.get();
            cxb cxbVar = this.f;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            gqp gqpVar = (gqp) cxbVar.a;
            gqpVar.a = gqpVar.b;
            gqpVar.b = jElapsedRealtime;
            PointF pointF = gqpVar.c;
            PointF pointF2 = gqpVar.d;
            pointF.set(pointF2.x, pointF2.y);
            pointF2.set(rectF.centerX(), rectF.centerY());
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fWidth = rectF.width() / 2.0f;
            float fHeight = rectF.height() / 2.0f;
            RectF rectF2 = new RectF(fCenterX - fWidth, fCenterY - fHeight, fCenterX + fWidth, fCenterY + fHeight);
            synchronized (this) {
                try {
                    i = this.e;
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                synchronized (this) {
                    try {
                        uuid = this.d;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                b(2, uuid);
                this.c.execute(new gdq((Object) this, (Object) rectF2, (Object) uuid, 3, (char[]) null));
                return;
            }
            if (i2 != 2) {
                return;
            }
            gqp gqpVar2 = (gqp) this.f.a;
            long j = gqpVar2.b - gqpVar2.a;
            PointF pointF3 = gqpVar2.d;
            PointF pointF4 = gqpVar2.c;
            float fMax = Math.max(Math.abs(pointF3.x - pointF4.x), Math.abs(pointF3.y - pointF4.y));
            gqo gqoVar = gqo.FAST_LONG;
            gqo[] gqoVarArrValues = gqo.values();
            int length = gqoVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                gqo gqoVar2 = gqoVarArrValues[i3];
                if (j >= gqoVar2.e && j < gqoVar2.f && fMax >= gqoVar2.g && fMax < gqoVar2.h) {
                    gqoVar = gqoVar2;
                    break;
                }
                i3++;
            }
            this.c.execute(new ng(this, rectF2, gqoVar.i, 8));
        }
    }

    public final synchronized void b(int i, UUID uuid) {
        if (a.K(this.d, uuid)) {
            this.e = i;
        }
    }
}
