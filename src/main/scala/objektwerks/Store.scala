package objektwerks

import com.typesafe.scalalogging.LazyLogging

import os.Path

import ox.*

import upickle.default.{read => readJson, write => writeJson}

import scalafx.application.Platform

final class Store extends LazyLogging:
  os.makeDir.all( buildRecipesPath )

  private val recipesPath = buildRecipesPath

  logger.info("Initialized store.")

  private def buildRecipesPath: Path = os.home / ".todo" / "data"
