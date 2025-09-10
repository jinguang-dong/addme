package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qks extends qkt {
    final /* synthetic */ int a;
    final /* synthetic */ float[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qks(int i, qhi qhiVar, int i2, int i3, float[] fArr) {
        super(i, qhiVar, i2);
        this.a = i3;
        this.b = fArr;
    }

    @Override // defpackage.qkt
    public final void a(int i, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            if (i2 >= i3) {
                return;
            }
            byteBuffer.putFloat(this.b[(i3 * i) + i2]);
            i2++;
        }
    }

    public final String toString() {
        return "GLVertexData{vertexCount=" + this.c + ", type=" + this.a + PNlJufQ.GbvNSlephrupm;
    }
}
