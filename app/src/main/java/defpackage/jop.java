package defpackage;

import android.media.MediaCodec;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jop {
    public final long a;
    public long c;
    final /* synthetic */ joq f;
    private final qfc g;
    public long b = 0;
    public boolean d = false;
    public boolean e = false;

    public jop(joq joqVar, qfc qfcVar, long j) {
        this.f = joqVar;
        this.g = qfcVar;
        this.a = j;
        long j2 = joqVar.d;
        this.c = j2;
        while (true) {
            j2++;
            if (j2 >= joqVar.e) {
                return;
            }
            qth qthVar = (qth) joqVar.b.get(Long.valueOf(j2));
            qthVar.getClass();
            if (((MediaCodec.BufferInfo) qthVar.b).presentationTimeUs >= j) {
                return;
            } else {
                this.c = j2;
            }
        }
    }

    public final void a(long j, boolean z) {
        joq joqVar = this.f;
        synchronized (joqVar) {
            if (this.e) {
                return;
            }
            this.b = j;
            this.d = z;
            long j2 = this.c;
            while (true) {
                j2++;
                if (j2 >= joqVar.e) {
                    break;
                }
                if (j2 > joqVar.d) {
                    qth qthVar = (qth) joqVar.b.get(Long.valueOf(j2));
                    qthVar.getClass();
                    Object obj = qthVar.b;
                    if (j < ((MediaCodec.BufferInfo) obj).presentationTimeUs) {
                        break;
                    } else if (((MediaCodec.BufferInfo) obj).presentationTimeUs < this.a) {
                        this.c = j2;
                    } else {
                        c(qthVar, j2);
                    }
                } else if (j2 >= 0) {
                    joqVar.a.h(mn.b(j2, "packet at index ", " was likely dropped too early"));
                }
            }
            b();
        }
    }

    public final void b() {
        if (!this.e && this.d) {
            joq joqVar = this.f;
            if (joqVar.c >= this.b - hpi.i || joqVar.f || this.a == this.b) {
                this.g.close();
                this.e = true;
            }
        }
    }

    public final void c(qth qthVar, long j) {
        if (this.e) {
            return;
        }
        Object obj = qthVar.a;
        Object obj2 = qthVar.b;
        joq joqVar = this.f;
        qth qthVarB = qth.b((ByteBuffer) obj, (MediaCodec.BufferInfo) obj2);
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) qthVarB.b;
        joqVar.a.g("writing packet <" + bufferInfo.presentationTimeUs + oUZhwRhE.xWgdSgCLMlVtCY);
        this.g.b((ByteBuffer) qthVarB.a, bufferInfo);
        this.c = j;
    }
}
