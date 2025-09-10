package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import androidx.wear.ambient.AmbientMode;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emn extends env implements Camera.ErrorCallback {
    final /* synthetic */ emr a;
    private final ene b;
    private Camera c;
    private int d;
    private int e;
    private kwp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emn(emr emrVar, ene eneVar, Looper looper) {
        super(looper);
        this.a = emrVar;
        this.d = -1;
        this.e = 0;
        this.b = eneVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.hardware.Camera$ShutterCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    @Override // defpackage.env, android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        emr emrVar = this.a;
        ent entVar = emrVar.e;
        if (entVar.d()) {
            eny enyVar = emr.a;
            AmbientMode.AmbientCallback.t(message.what);
            enz.g(enyVar);
            return;
        }
        eny enyVar2 = emr.a;
        AmbientMode.AmbientCallback.t(message.what);
        enz.g(enyVar2);
        int i = message.what;
        try {
            try {
                if (i == 1) {
                    emw emwVar = (emw) message.obj;
                    int i2 = message.arg1;
                    emr emrVar2 = this.a;
                    ent entVar2 = emrVar2.e;
                    if (entVar2.a() != 1) {
                        emwVar.d(i2, c(i2));
                    } else {
                        enz.f(emr.a);
                        Camera cameraOpen = Camera.open(i2);
                        this.c = cameraOpen;
                        if (cameraOpen != null) {
                            this.d = i2;
                            this.f = new kwp(cameraOpen);
                            emrVar2.b = emi.c().b(i2);
                            emrVar2.c = new ems(this.f.o());
                            this.c.setErrorCallback(this);
                            entVar2.c(2);
                            if (emwVar != null) {
                                emwVar.b(new emm(emrVar2, this.b, i2, this.c, emrVar2.c));
                            }
                        } else if (emwVar != null) {
                            emwVar.c(i2, c(i2));
                        }
                    }
                } else if (i == 2) {
                    Camera camera = this.c;
                    if (camera != null) {
                        camera.release();
                        this.a.e.c(1);
                        this.c = null;
                        this.d = -1;
                    } else {
                        enz.c(emr.a, "Releasing camera without any camera opened.");
                    }
                } else if (i == 3) {
                    emx emxVar = (emx) message.obj;
                    int i3 = message.arg1;
                    try {
                        this.c.reconnect();
                        emr emrVar3 = this.a;
                        emrVar3.e.c(2);
                        if (emxVar != null) {
                            emxVar.b(new emm(emrVar3, emrVar3, i3, this.c, emrVar3.c));
                        }
                    } catch (IOException unused) {
                        if (emxVar != null) {
                            emxVar.a.post(new as(emxVar, this.b, c(this.d), 11));
                        }
                    }
                } else if (i == 4) {
                    this.c.unlock();
                    this.a.e.c(4);
                } else if (i == 5) {
                    this.c.lock();
                    this.a.e.c(2);
                } else if (i != 601) {
                    switch (i) {
                        case 101:
                            try {
                                this.c.setPreviewTexture((SurfaceTexture) message.obj);
                                break;
                            } catch (IOException e) {
                                enz.b(emr.a, "Could not set preview texture", e);
                                break;
                            }
                        case 102:
                            enc encVar = (enc) message.obj;
                            this.c.startPreview();
                            if (encVar != null) {
                                encVar.a();
                                break;
                            }
                            break;
                        case 103:
                            this.c.stopPreview();
                            break;
                        case 104:
                            this.c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) message.obj);
                            break;
                        case 105:
                            this.c.addCallbackBuffer((byte[]) message.obj);
                            break;
                        case 106:
                            try {
                                this.c.setPreviewDisplay((SurfaceHolder) message.obj);
                                break;
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        case 107:
                            this.c.setPreviewCallback((Camera.PreviewCallback) message.obj);
                            break;
                        case 108:
                            this.c.setOneShotPreviewCallback((Camera.PreviewCallback) message.obj);
                            break;
                        default:
                            switch (i) {
                                case 201:
                                    Camera.Parameters parametersO = this.f.o();
                                    parametersO.unflatten((String) message.obj);
                                    this.c.setParameters(parametersO);
                                    this.f.p();
                                    break;
                                case 202:
                                    ((Camera.Parameters[]) message.obj)[0] = this.f.o();
                                    break;
                                case 203:
                                    this.f.p();
                                    break;
                                case 204:
                                    Camera.Parameters parametersO2 = this.f.o();
                                    ens ensVar = (ens) message.obj;
                                    emr emrVar4 = this.a;
                                    AmbientMode.AmbientCallback ambientCallback = emrVar4.c.w;
                                    enx enxVarE = ensVar.e();
                                    parametersO2.setPictureSize(enxVarE.b(), enxVarE.a());
                                    enx enxVarF = ensVar.f();
                                    parametersO2.setPreviewSize(enxVarF.b(), enxVarF.a());
                                    int i4 = ensVar.j;
                                    if (i4 == -1) {
                                        parametersO2.setPreviewFpsRange(ensVar.h, ensVar.i);
                                    } else {
                                        parametersO2.setPreviewFrameRate(i4);
                                    }
                                    parametersO2.setPreviewFormat(ensVar.l);
                                    parametersO2.setJpegQuality(ensVar.n);
                                    if (emrVar4.c.d(eng.ZOOM)) {
                                        float f = ensVar.p;
                                        List<Integer> zoomRatios = parametersO2.getZoomRatios();
                                        int iBinarySearch = Collections.binarySearch(zoomRatios, Integer.valueOf((int) (f * 100.0f)));
                                        if (iBinarySearch < 0 && (iBinarySearch = -(iBinarySearch + 1)) == zoomRatios.size()) {
                                            iBinarySearch--;
                                        }
                                        parametersO2.setZoom(iBinarySearch);
                                    }
                                    parametersO2.setExposureCompensation(ensVar.q);
                                    if (emrVar4.c.d(eng.AUTO_EXPOSURE_LOCK)) {
                                        parametersO2.setAutoExposureLock(ensVar.w);
                                    }
                                    parametersO2.setFocusMode(AmbientMode.AmbientCallback.r(ensVar.s.name()));
                                    if (emrVar4.c.d(eng.AUTO_WHITE_BALANCE_LOCK)) {
                                        parametersO2.setAutoWhiteBalanceLock(ensVar.x);
                                    }
                                    if (emrVar4.c.d(eng.FOCUS_AREA)) {
                                        if (ensVar.g().size() != 0) {
                                            parametersO2.setFocusAreas(ensVar.g());
                                        } else {
                                            parametersO2.setFocusAreas(null);
                                        }
                                    }
                                    if (emrVar4.c.d(eng.METERING_AREA)) {
                                        if (ensVar.h().size() != 0) {
                                            parametersO2.setMeteringAreas(ensVar.h());
                                        } else {
                                            parametersO2.setMeteringAreas(null);
                                        }
                                    }
                                    enh enhVar = ensVar.r;
                                    if (enhVar != enh.NO_FLASH) {
                                        parametersO2.setFlashMode(AmbientMode.AmbientCallback.r(enhVar.name()));
                                    }
                                    enj enjVar = ensVar.t;
                                    if (enjVar != enj.NO_SCENE_MODE && enjVar != null) {
                                        parametersO2.setSceneMode(AmbientMode.AmbientCallback.r(enjVar.name()));
                                    }
                                    parametersO2.setRecordingHint(ensVar.y);
                                    enx enxVar = ensVar.z;
                                    enx enxVar2 = enxVar == null ? null : new enx(enxVar);
                                    if (enxVar2 != null) {
                                        parametersO2.setJpegThumbnailSize(enxVar2.b(), enxVar2.a());
                                    }
                                    parametersO2.setPictureFormat(ensVar.o);
                                    parametersO2.removeGpsData();
                                    this.c.setParameters(parametersO2);
                                    this.f.p();
                                    break;
                                default:
                                    switch (i) {
                                        case 301:
                                            if (this.e <= 0) {
                                                this.a.e.c(16);
                                                this.c.autoFocus((Camera.AutoFocusCallback) message.obj);
                                                break;
                                            } else {
                                                enz.g(emr.a);
                                                break;
                                            }
                                        case 302:
                                            this.e++;
                                            this.c.cancelAutoFocus();
                                            this.a.e.c(2);
                                            break;
                                        case 303:
                                            try {
                                                this.c.setAutoFocusMoveCallback((Camera.AutoFocusMoveCallback) message.obj);
                                                break;
                                            } catch (RuntimeException e3) {
                                                enz.c(emr.a, e3.getMessage());
                                                break;
                                            }
                                        case 304:
                                            this.c.setZoomChangeListener((Camera.OnZoomChangeListener) message.obj);
                                            break;
                                        case 305:
                                            this.e--;
                                            break;
                                        default:
                                            switch (i) {
                                                case 461:
                                                    this.c.setFaceDetectionListener((Camera.FaceDetectionListener) message.obj);
                                                    break;
                                                case 462:
                                                    this.c.startFaceDetection();
                                                    break;
                                                case 463:
                                                    this.c.stopFaceDetection();
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 501:
                                                            this.c.enableShutterSound(message.arg1 == 1);
                                                            break;
                                                        case 502:
                                                            this.c.setDisplayOrientation(emrVar.b.e(message.arg1, true));
                                                            Camera.Parameters parametersO3 = this.f.o();
                                                            parametersO3.setRotation(message.arg2 > 0 ? emrVar.b.d(message.arg1) : 0);
                                                            this.c.setParameters(parametersO3);
                                                            this.f.p();
                                                            break;
                                                        case 503:
                                                            Camera.Parameters parametersO4 = this.f.o();
                                                            parametersO4.setRotation(message.arg1);
                                                            this.c.setParameters(parametersO4);
                                                            this.f.p();
                                                            break;
                                                        default:
                                                            enz.a(enyVar2, "Invalid CameraProxy message=" + message.what);
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    entVar.c(8);
                    gga ggaVar = (gga) message.obj;
                    this.c.takePicture(ggaVar.c, ggaVar.d, ggaVar.b, ggaVar.a);
                }
            } catch (RuntimeException e4) {
                ent entVar3 = this.a.e;
                int iA = entVar3.a();
                String str = "CameraAction[" + AmbientMode.AmbientCallback.t(i) + "] at CameraState[" + iA + "]";
                eny enyVar3 = emr.a;
                enz.b(enyVar3, mn.g(str, "RuntimeException during "), e4);
                entVar3.b();
                if (this.c != null) {
                    enz.f(enyVar3);
                    try {
                        try {
                            this.c.release();
                            this.c = null;
                        } catch (Throwable th) {
                            this.c = null;
                            throw th;
                        }
                    } catch (Exception e5) {
                        enz.b(emr.a, "Fail when calling Camera.release().", e5);
                        this.c = null;
                    }
                }
                if (message.what == 1 && this.c == null) {
                    int i5 = message.arg1;
                    if (message.obj != null) {
                        ((emw) message.obj).c(message.arg1, c(i5));
                    }
                } else {
                    ((emr) this.b).g.b(e4, c(this.d), i, iA);
                }
            }
        } finally {
            end.a(message);
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i, Camera camera) {
        emr emrVar = this.a;
        emrVar.g.a(i);
        if (i == 100) {
            emrVar.g.b(new RuntimeException("Media server died."), c(this.d), ((Integer) this.r.peekLast()).intValue(), emrVar.e.a());
        }
    }
}
