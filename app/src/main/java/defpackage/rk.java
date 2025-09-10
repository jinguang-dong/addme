package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rk implements sz {
    public final ta a;
    private final CameraCaptureSession b;
    private final Handler c;
    private final byz d;

    public rk(ta taVar, CameraCaptureSession cameraCaptureSession, byz byzVar, Handler handler) {
        taVar.getClass();
        byzVar.getClass();
        handler.getClass();
        this.a = taVar;
        this.b = cameraCaptureSession;
        this.d = byzVar;
        this.c = handler;
    }

    @Override // defpackage.sz
    public final Surface a() {
        return this.b.getInputSurface();
    }

    @Override // defpackage.sz
    public final ta b() {
        return this.a;
    }

    @Override // defpackage.ri
    public Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CameraCaptureSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.sz
    public final Integer d(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        captureRequest.getClass();
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#capture-".concat(str));
            byz byzVar = this.d;
            try {
                numValueOf = Integer.valueOf(this.b.capture(captureRequest, captureCallback, this.c));
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final Integer e(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        list.getClass();
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#captureBurst-".concat(str));
            byz byzVar = this.d;
            try {
                numValueOf = Integer.valueOf(this.b.captureBurst(list, captureCallback, this.c));
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final Integer f(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        list.getClass();
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#setRepeatingBurst-".concat(str));
            byz byzVar = this.d;
            try {
                numValueOf = Integer.valueOf(this.b.setRepeatingBurst(list, captureCallback, this.c));
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final Integer g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        captureRequest.getClass();
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#setRepeatingRequest-".concat(str));
            byz byzVar = this.d;
            try {
                numValueOf = Integer.valueOf(this.b.setRepeatingRequest(captureRequest, captureCallback, this.c));
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final void h() {
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#abortCaptures-".concat(str));
            byz byzVar = this.d;
            try {
                this.b.abortCaptures();
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final void i(List list) {
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#finalizeOutputConfigurations-".concat(str));
            byz byzVar = this.d;
            try {
                CameraCaptureSession cameraCaptureSession = this.b;
                ArrayList arrayList = new ArrayList(ske.bq(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sa saVar = (sa) it.next();
                    int i = ukb.a;
                    arrayList.add(saVar.c(new uji(OutputConfiguration.class)));
                }
                cameraCaptureSession.finalizeOutputConfigurations(arrayList);
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.sz
    public final void j() {
        String str = ((rm) this.a).a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("CXCP#stopRepeating-".concat(str));
            byz byzVar = this.d;
            try {
                this.b.stopRepeating();
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }
}
