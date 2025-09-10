package defpackage;

import com.google.ar.core.PointCloud;
import java.io.Closeable;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fov extends fok implements Closeable {
    public fov(PointCloud pointCloud) {
        super(pointCloud);
    }

    public final long b() {
        PointCloud pointCloud = (PointCloud) this.a;
        pointCloud.getClass();
        return ((Long) ezh.k(new foq(pointCloud, 4))).longValue();
    }

    public final FloatBuffer c() {
        PointCloud pointCloud = (PointCloud) this.a;
        pointCloud.getClass();
        return (FloatBuffer) ezh.k(new foq(pointCloud, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void close() {
        PointCloud pointCloud = (PointCloud) this.a;
        pointCloud.getClass();
        ezh.m(new foh(pointCloud, 2));
    }
}
