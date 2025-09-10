package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emb extends env {
    public emw a;
    public int b;
    public String c;
    public CameraDevice d;
    public elu e;
    public Rect f;
    public boolean g;
    public CameraCaptureSession h;
    public ImageReader i;
    public enb j;
    public emu k;
    public emc l;
    public emv m;
    public int n;
    public final ema o;
    final /* synthetic */ emd p;
    public oyw q;
    private int s;
    private enx t;
    private enx u;
    private SurfaceTexture v;
    private Surface w;
    private final CameraDevice.StateCallback x;
    private final CameraCaptureSession.StateCallback y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emb(emd emdVar, Looper looper) {
        super(looper);
        this.p = emdVar;
        this.s = 0;
        this.n = 0;
        this.x = new elx(this);
        this.y = new ely(this);
        this.o = new elz(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(defpackage.emf r19) throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emb.d(emf):void");
    }

    private final void e() throws CameraAccessException {
        try {
            this.h.abortCaptures();
            this.h = null;
        } catch (CameraAccessException e) {
            enz.b(emd.a, "Failed to close existing camera capture session", e);
        }
        a(4);
    }

    private final void f(SurfaceTexture surfaceTexture) throws CameraAccessException {
        if (this.p.c.a() < 4) {
            enz.c(emd.a, "Ignoring texture setting at inappropriate time");
            return;
        }
        if (surfaceTexture == this.v) {
            enz.f(emd.a);
            return;
        }
        if (this.h != null) {
            e();
        }
        this.v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.t.b(), this.t.a());
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
        }
        this.w = new Surface(surfaceTexture);
        ImageReader imageReader = this.i;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.u.b(), this.u.a(), 256, 1);
        this.i = imageReaderNewInstance;
        try {
            this.d.createCaptureSession(Arrays.asList(this.w, imageReaderNewInstance.getSurface()), this.y, this);
        } catch (CameraAccessException e) {
            enz.b(emd.a, "Failed to create camera capture session", e);
        }
    }

    public final void a(int i) {
        ent entVar = this.p.c;
        if (entVar.a() != i) {
            entVar.c(i);
            if (i < 16) {
                this.n = 0;
                elz elzVar = (elz) this.o;
                elzVar.a = -1;
                elzVar.b = -1L;
                elzVar.c = -1L;
            }
        }
    }

    public final ens b() {
        try {
            return new emf(this.d, this.f, this.t, this.u);
        } catch (CameraAccessException unused) {
            enz.a(emd.a, "Unable to query camera device to build settings representation");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0289 A[Catch: all -> 0x02d8, Exception -> 0x02da, TryCatch #3 {Exception -> 0x02da, blocks: (B:21:0x0042, B:22:0x0055, B:23:0x0056, B:24:0x005e, B:26:0x006d, B:27:0x0076, B:28:0x0089, B:31:0x009d, B:32:0x00a9, B:34:0x00ad, B:35:0x00b4, B:37:0x00be, B:38:0x00c7, B:39:0x00df, B:42:0x00f3, B:43:0x00ff, B:45:0x0109, B:46:0x0112, B:47:0x011c, B:49:0x0126, B:50:0x012f, B:51:0x0138, B:54:0x0150, B:55:0x015c, B:56:0x0165, B:57:0x0174, B:59:0x017c, B:60:0x0186, B:61:0x018f, B:63:0x0199, B:64:0x01a0, B:66:0x01a6, B:67:0x01ab, B:69:0x01b3, B:71:0x01b7, B:73:0x01c5, B:76:0x01d0, B:77:0x01e4, B:80:0x01f8, B:81:0x0201, B:82:0x0209, B:85:0x0223, B:86:0x022c, B:87:0x0234, B:88:0x023d, B:90:0x0247, B:91:0x0250, B:93:0x0254, B:94:0x0259, B:96:0x025d, B:97:0x0262, B:99:0x026c, B:100:0x0271, B:102:0x0277, B:103:0x027c, B:104:0x0289, B:106:0x0299, B:107:0x02a2, B:109:0x02c8, B:110:0x02d0), top: B:139:0x001a, outer: #5 }] */
    @Override // defpackage.env, android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emb.handleMessage(android.os.Message):void");
    }
}
